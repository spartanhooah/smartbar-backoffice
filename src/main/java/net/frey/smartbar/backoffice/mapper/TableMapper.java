package net.frey.smartbar.backoffice.mapper;

import net.frey.smartbar.backoffice.api.model.TableRo;
import net.frey.smartbar.backoffice.data.Table;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface TableMapper {
    @Mapping(target = "id", ignore = true)
    Table toEntity(TableRo tableRo);

    TableRo toRo(Table table);
}
