package net.frey.smartbar.backoffice.api.resource;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import jakarta.ws.rs.core.Response;
import java.net.URI;
import lombok.RequiredArgsConstructor;
import net.frey.smartbar.backoffice.api.model.CategoryRo;
import net.frey.smartbar.backoffice.api.service.CategoryService;
import net.frey.smartbar.backoffice.data.Category;
import net.frey.smartbar.backoffice.mapper.CategoryMapper;

@RequiredArgsConstructor
public class CategoriesResource implements CategoriesApi {
    private final CategoryService categoryService;
    private final CategoryMapper mapper;

    @Override
    public Response categoriesCategoryIdDelete(String categoryId) {
        categoryService.delete(Category.class, Long.valueOf(categoryId));

        return Response.noContent().build();
    }

    @Override
    public Response categoriesCategoryIdGet(String categoryId) {
        Category entity = categoryService.get(Category.class, Long.valueOf(categoryId));

        return Response.ok(entity).build();
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
        return Response.ok(categoryService.getAll(Category.class).stream().map(mapper::toRo))
                .build();
    }

    @Override
    public Response categoriesPost(CategoryRo category) {
        final var persistedCategory = categoryService.persist(mapper.toEntity(category));

        return Response.created(URI.create("/categories/" + persistedCategory.getId()))
                .build();
    }
}
