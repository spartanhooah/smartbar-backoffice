package net.frey.smartbar.backoffice.mapper;

import net.frey.smartbar.backoffice.api.model.ItemRo;
import net.frey.smartbar.backoffice.data.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface ItemMapper {
    @Mapping(target = "id", ignore = true)
    Item toEntity(ItemRo itemRo);

    ItemRo toRo(Item item);
}
