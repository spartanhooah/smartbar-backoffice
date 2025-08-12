package net.frey.smartbar.backoffice.api.resource;

import io.smallrye.common.annotation.NonBlocking;
import jakarta.ws.rs.core.Response;
import java.net.URI;
import java.util.List;
import net.frey.smartbar.backoffice.api.model.Category;

@NonBlocking
public class CategoriesResource implements CategoriesApi {
    private final Category category = new Category().name("drinks");

    @Override
    public Response categoriesCategoryIdDelete(String categoryId) {
        return Response.ok().build();
    }

    @Override
    public Response categoriesCategoryIdGet(String categoryId) {
        return Response.ok(category).build();
    }

    @Override
    public Response categoriesCategoryIdPut(String categoryId, Category category) {
        return Response.ok().build();
    }

    @Override
    public Response categoriesGet() {
        return Response.ok(List.of(category)).build();
    }

    @Override
    public Response categoriesPost(Category category) {
        return Response.created(URI.create("todo")).build();
    }
}
