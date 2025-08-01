package net.frey.smartbar.backoffice.api;

import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import net.frey.smartbar.backoffice.api.model.Table;

/**
 * Represents a collection of functions to interact with the API endpoints.
 */
@Path("/tables")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-01T14:11:55.358897561-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public class TablesApi {

    @GET
    @Produces({"application/json"})
    public Response tablesGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({"application/json"})
    public Response tablesPost(@Valid Table table) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{tableId}")
    public Response tablesTableIdDelete(@PathParam("tableId") String tableId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{tableId}")
    @Produces({"application/json"})
    public Response tablesTableIdGet(@PathParam("tableId") String tableId) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{tableId}")
    @Consumes({"application/json"})
    public Response tablesTableIdPut(@PathParam("tableId") String tableId, @Valid Table table) {
        return Response.ok().entity("magic!").build();
    }
}
