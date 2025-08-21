package net.frey.smartbar.backoffice.data;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@jakarta.persistence.Table(name = "Sbo_Category")
public class Category extends BaseEntity {
    @NotNull
    private String name;

    @NotNull
    private String description;
}
