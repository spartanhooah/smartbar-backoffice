package net.frey.smartbar.backoffice.mapper;

import net.frey.smartbar.backoffice.api.model.CategoryRo;
import net.frey.smartbar.backoffice.data.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface CategoryMapper {
    @Mapping(target = "id", ignore = true)
    Category toEntity(CategoryRo categoryRo);

    CategoryRo toRo(Category category);
}
