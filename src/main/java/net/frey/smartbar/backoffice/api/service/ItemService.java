package net.frey.smartbar.backoffice.api.service;

import jakarta.enterprise.context.ApplicationScoped;
import net.frey.smartbar.backoffice.api.model.Item;

@ApplicationScoped
public class ItemService {
    public Item get() {
        return new Item().name("cola");
    }
}
