package net.frey.smartbar.backoffice.api.resource;

import jakarta.ws.rs.core.Response;
import java.net.URI;
import java.util.List;
import lombok.RequiredArgsConstructor;
import net.frey.smartbar.backoffice.api.model.TableRo;
import net.frey.smartbar.backoffice.api.service.TableService;
import net.frey.smartbar.backoffice.data.Table;

@RequiredArgsConstructor
public class TablesResource implements TablesApi {
    private final TableService tableService;

    @Override
    public Response tablesGet() {
        return Response.ok(List.of(tableService.get())).build();
    }

    @Override
    public Response tablesPost(TableRo tableRo) {
        final Table table = new Table();
        table.setName(tableRo.getName());
        table.setSeatCount(tableRo.getSeatCount());
        table.setActive(tableRo.getActive());

        final Table persistedTable = tableService.persist(table);

        return Response.created(URI.create("/tables/" + persistedTable.getId())).build();
    }

    @Override
    public Response tablesTableIdDelete(String tableId) {
        return null;
    }

    @Override
    public Response tablesTableIdGet(String tableId) {
        return null;
    }

    @Override
    public Response tablesTableIdPut(String tableId, TableRo table) {
        return null;
    }
}
