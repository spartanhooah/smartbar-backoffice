package net.frey.smartbar.backoffice.api.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import net.frey.smartbar.backoffice.data.Category;

@ApplicationScoped
public class CategoryService extends CrudService<Category> {
    public CategoryService() {
        super(null);
    }

    public CategoryService(EntityManager em) {
        super(em);
    }
}
