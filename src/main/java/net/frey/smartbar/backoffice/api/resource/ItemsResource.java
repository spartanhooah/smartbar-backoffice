package net.frey.smartbar.backoffice.api.resource;

import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;
import net.frey.smartbar.backoffice.api.model.ItemRo;
import net.frey.smartbar.backoffice.api.service.ItemService;
import net.frey.smartbar.backoffice.data.Item;

import java.net.URI;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@RequiredArgsConstructor
public class ItemsResource implements ItemsApi {
    private final ItemService itemService;

    @Override
    public Response itemsGet() {
        return Response.ok(itemService.getAll(Item.class)).build();
    }

    @Override
    public Response itemsItemIdDelete(String itemId) {
        itemService.delete(Item.class, Long.valueOf(itemId));

        return Response.noContent().build();
    }

    @Override
    public Response itemsItemIdGet(String itemId) {
        return Response.ok(itemService.get(Item.class, Long.valueOf(itemId))).build();
    }

    @Override
    public Response itemsItemIdPut(String itemId, ItemRo item) {
        var itemToUpdate = itemService.get(Item.class, Long.valueOf(itemId));

        if (isNotEmpty(item.getDescription())) {
            itemToUpdate.setDescription(item.getDescription());
        }

        if (isNotEmpty(item.getName())) {
            itemToUpdate.setName(item.getName());
        }

        if (isNotEmpty(item.getPicture())) {
            itemToUpdate.setPicture(item.getPicture());
        }

        if (item.getPrice() != null) {
            itemToUpdate.setPrice(item.getPrice());
        }

        itemService.update(itemToUpdate);

        return Response.noContent().build();
    }

    @Override
    public Response itemsPost(ItemRo newItem) {
        final var item = new Item();
        item.setDescription(newItem.getDescription());
        item.setPicture(newItem.getPicture());
        item.setPrice(newItem.getPrice());
        item.setName(newItem.getName());

        final var persistedItem = itemService.persist(item);

        return Response.created(URI.create("/items/" + persistedItem.getId())).build();
    }
}
