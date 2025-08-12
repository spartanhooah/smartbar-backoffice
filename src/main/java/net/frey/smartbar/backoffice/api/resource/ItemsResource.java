package net.frey.smartbar.backoffice.api.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import java.util.List;
import net.frey.smartbar.backoffice.api.model.Item;
import net.frey.smartbar.backoffice.api.service.ItemService;

public class ItemsResource implements ItemsApi {
    private final ItemService itemService;

    @Inject
    public ItemsResource(ItemService itemService) {
        this.itemService = itemService;
    }

    @Override
    public Response itemsGet() {
        return Response.ok(List.of(itemService.get())).build();
    }

    @Override
    public Response itemsItemIdDelete(String itemId) {
        return null;
    }

    @Override
    public Response itemsItemIdGet(String itemId) {
        return Response.ok(itemService.get()).build();
    }

    @Override
    public Response itemsItemIdPut(String itemId, Item item) {
        return null;
    }

    @Override
    public Response itemsPost(Item item) {
        return null;
    }
}
