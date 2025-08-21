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
import net.frey.smartbar.backoffice.api.model.ItemRo;

/**
 * Represents a collection of functions to interact with the API endpoints.
 */
@Path("/items")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-21T13:45:59.456751902-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public interface ItemsApi {

    /**
     *
     *
     * @return Success
     */
    @GET
    @Produces({"application/json"})
    Response itemsGet();

    /**
     *
     *
     * @param itemId
     * @return Entity successfully deleted
     */
    @DELETE
    @Path("/{itemId}")
    Response itemsItemIdDelete(@PathParam("itemId") String itemId);

    /**
     *
     *
     * @param itemId
     * @return Success
     */
    @GET
    @Path("/{itemId}")
    @Produces({"application/json"})
    Response itemsItemIdGet(@PathParam("itemId") String itemId);

    /**
     *
     *
     * @param itemId
     * @param itemRo
     * @return Entity successfully updated
     */
    @PUT
    @Path("/{itemId}")
    @Consumes({"application/json"})
    Response itemsItemIdPut(@PathParam("itemId") String itemId, @Valid ItemRo itemRo);

    /**
     *
     *
     * @param itemRo
     * @return Entity successfully created
     */
    @POST
    @Consumes({"application/json"})
    Response itemsPost(@Valid ItemRo itemRo);
}
