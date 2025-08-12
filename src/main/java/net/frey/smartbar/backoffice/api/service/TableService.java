package net.frey.smartbar.backoffice.api.service;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import net.frey.smartbar.backoffice.api.model.TableRo;
import net.frey.smartbar.backoffice.data.Table;

@Dependent
public class TableService extends CrudService<Table> {
    public TableService() {
        super(null);
    }

    @Inject
    public TableService(EntityManager em) {
        super(em);
    }

    public TableRo get() {
        return new TableRo().name("Berlin");
    }
}
