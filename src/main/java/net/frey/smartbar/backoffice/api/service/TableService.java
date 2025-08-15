package net.frey.smartbar.backoffice.api.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import net.frey.smartbar.backoffice.data.Table;

@ApplicationScoped
public class TableService extends CrudService<Table> {
    public TableService() {
        super(null);
    }

    @Inject
    public TableService(EntityManager em) {
        super(em);
    }
}
