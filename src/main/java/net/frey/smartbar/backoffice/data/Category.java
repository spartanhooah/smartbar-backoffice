package net.frey.smartbar.backoffice.data;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@jakarta.persistence.Table(name = "Sbo_Category")
public class Category extends BaseEntity {
    private String name;
    private String description;
}
