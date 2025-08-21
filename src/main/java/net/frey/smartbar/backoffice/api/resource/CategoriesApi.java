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
import net.frey.smartbar.backoffice.api.model.CategoryRo;

/**
 * Represents a collection of functions to interact with the API endpoints.
 */
@Path("/categories")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-21T13:45:59.456751902-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public interface CategoriesApi {

    /**
     *
     *
     * @param categoryId
     * @return Entity successfully deleted
     */
    @DELETE
    @Path("/{categoryId}")
    Response categoriesCategoryIdDelete(@PathParam("categoryId") String categoryId);

    /**
     *
     *
     * @param categoryId
     * @return Success
     */
    @GET
    @Path("/{categoryId}")
    @Produces({"application/json"})
    Response categoriesCategoryIdGet(@PathParam("categoryId") String categoryId);

    /**
     *
     *
     * @param categoryId
     * @param categoryRo
     * @return Entity successfully updated
     */
    @PUT
    @Path("/{categoryId}")
    @Consumes({"application/json"})
    Response categoriesCategoryIdPut(@PathParam("categoryId") String categoryId, @Valid CategoryRo categoryRo);

    /**
     *
     *
     * @return Success
     */
    @GET
    @Produces({"application/json"})
    Response categoriesGet();

    /**
     *
     *
     * @param categoryRo
     * @return Entity successfully created
     */
    @POST
    @Consumes({"application/json"})
    Response categoriesPost(@Valid CategoryRo categoryRo);
}
