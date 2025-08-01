package net.frey.smartbar.backoffice.api;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import net.frey.smartbar.backoffice.api.model.Item;

/**
 * Represents a collection of functions to interact with the API endpoints.
 */
@Path("/items")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-01T14:11:55.358897561-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public class ItemsApi {

    @GET
    @Produces({"application/json"})
    public Response itemsGet() {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{itemId}")
    public Response itemsItemIdDelete(@PathParam("itemId") String itemId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{itemId}")
    @Produces({"application/json"})
    public Response itemsItemIdGet(@PathParam("itemId") String itemId) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{itemId}")
    @Consumes({"application/json"})
    public Response itemsItemIdPut(@PathParam("itemId") String itemId, @Valid Item item) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({"application/json"})
    public Response itemsPost(@Valid Item item) {
        return Response.ok().entity("magic!").build();
    }
}
