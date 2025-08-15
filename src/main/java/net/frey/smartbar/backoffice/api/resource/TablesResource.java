package net.frey.smartbar.backoffice.api.resource;

import jakarta.ws.rs.core.Response;
import java.net.URI;
import lombok.RequiredArgsConstructor;
import net.frey.smartbar.backoffice.api.model.TableRo;
import net.frey.smartbar.backoffice.api.service.TableService;
import net.frey.smartbar.backoffice.data.Table;
import org.apache.commons.lang3.StringUtils;

@RequiredArgsConstructor
public class TablesResource implements TablesApi {
    private final TableService tableService;

    @Override
    public Response tablesGet() {
        return Response.ok(tableService.getAll(Table.class)).build();
    }

    @Override
    public Response tablesPost(TableRo tableRo) {
        final var table = new Table();
        table.setName(tableRo.getName());
        table.setSeatCount(tableRo.getSeatCount());
        table.setActive(tableRo.getActive());

        final var persistedTable = tableService.persist(table);

        return Response.created(URI.create("/tables/" + persistedTable.getId())).build();
    }

    @Override
    public Response tablesTableIdDelete(String tableId) {
        tableService.delete(Table.class, Long.valueOf(tableId));

        return Response.noContent().build();
    }

    @Override
    public Response tablesTableIdGet(String tableId) {
        return Response.ok(tableService.get(Table.class, Long.valueOf(tableId))).build();
    }

    @Override
    public Response tablesTableIdPut(String tableId, TableRo table) {
        var tableToUpdate = tableService.get(Table.class, Long.valueOf(tableId));

        if (table.getActive() != null) {
            tableToUpdate.setActive(table.getActive());
        }

        if (StringUtils.isNotEmpty(table.getName())) {
            tableToUpdate.setName(table.getName());
        }

        if (table.getSeatCount() != null) {
            tableToUpdate.setSeatCount(table.getSeatCount());
        }

        tableService.update(tableToUpdate);

        return Response.noContent().build();
    }
}
