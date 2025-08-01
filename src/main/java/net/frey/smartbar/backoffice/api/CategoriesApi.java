package net.frey.smartbar.backoffice.api;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import net.frey.smartbar.backoffice.api.model.Category;

/**
 * Represents a collection of functions to interact with the API endpoints.
 */
@Path("/categories")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-01T14:11:55.358897561-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public class CategoriesApi {

    @DELETE
    @Path("/{categoryId}")
    public Response categoriesCategoryIdDelete(@PathParam("categoryId") String categoryId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{categoryId}")
    @Produces({"application/json"})
    public Response categoriesCategoryIdGet(@PathParam("categoryId") String categoryId) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/{categoryId}")
    @Consumes({"application/json"})
    public Response categoriesCategoryIdPut(@PathParam("categoryId") String categoryId, @Valid Category category) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({"application/json"})
    public Response categoriesGet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({"application/json"})
    public Response categoriesPost(@Valid Category category) {
        return Response.ok().entity("magic!").build();
    }
}
