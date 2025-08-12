package net.frey.smartbar.backoffice.api.resource;

import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import net.frey.smartbar.backoffice.api.model.TableRo;

/**
 * Represents a collection of functions to interact with the API endpoints.
 */
@Path("/tables")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-11T13:47:41.328995228-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public interface TablesApi {

    /**
     *
     *
     * @return Success
     */
    @GET
    @Produces({"application/json"})
    Response tablesGet();

    /**
     *
     *
     * @param tableRo
     * @return Entity successfully created
     */
    @POST
    @Consumes({"application/json"})
    Response tablesPost(@Valid TableRo tableRo);

    /**
     *
     *
     * @param tableId
     * @return Entity successfully deleted
     */
    @DELETE
    @Path("/{tableId}")
    Response tablesTableIdDelete(@PathParam("tableId") String tableId);

    /**
     *
     *
     * @param tableId
     * @return Success
     */
    @GET
    @Path("/{tableId}")
    @Produces({"application/json"})
    Response tablesTableIdGet(@PathParam("tableId") String tableId);

    /**
     *
     *
     * @param tableId
     * @param tableRo
     * @return Entity successfully updated
     */
    @PUT
    @Path("/{tableId}")
    @Consumes({"application/json"})
    Response tablesTableIdPut(@PathParam("tableId") String tableId, @Valid TableRo tableRo);
}
