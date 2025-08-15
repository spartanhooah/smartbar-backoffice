package net.frey.smartbar.backoffice.api.resource;

import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;
import net.frey.smartbar.backoffice.api.model.CategoryRo;
import net.frey.smartbar.backoffice.api.service.CategoryService;
import net.frey.smartbar.backoffice.data.Category;

import java.net.URI;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@RequiredArgsConstructor
public class CategoriesResource implements CategoriesApi {
    private final CategoryService categoryService;

    @Override
    public Response categoriesCategoryIdDelete(String categoryId) {
        categoryService.delete(Category.class, Long.valueOf(categoryId));

        return Response.noContent().build();
    }

    @Override
    public Response categoriesCategoryIdGet(String categoryId) {
        return Response.ok(categoryService.get(Category.class, Long.valueOf(categoryId))).build();
    }

    @Override
    public Response categoriesCategoryIdPut(String categoryId, CategoryRo category) {
        var categoryToUpdate = categoryService.get(Category.class, Long.valueOf(categoryId));

        if (isNotEmpty(category.getDescription())) {
            categoryToUpdate.setDescription(category.getDescription());
        }

        if (isNotEmpty(category.getName())) {
            categoryToUpdate.setName(category.getName());
        }

        categoryService.update(categoryToUpdate);

        return Response.noContent().build();
    }

    @Override
    public Response categoriesGet() {
        return Response.ok(categoryService.getAll(Category.class)).build();
    }

    @Override
    public Response categoriesPost(CategoryRo category) {
        final var newCategory = new Category();
        newCategory.setName(category.getName());
        newCategory.setDescription(category.getDescription());

        final var persistedCategory = categoryService.persist(newCategory);

        return Response.created(URI.create("/categories/" + persistedCategory.getId())).build();
    }
}
