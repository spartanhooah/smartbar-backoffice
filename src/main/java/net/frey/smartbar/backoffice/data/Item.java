package net.frey.smartbar.backoffice.data;

import jakarta.persistence.Entity;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@jakarta.persistence.Table(name = "Sbo_Item")
public class Item extends BaseEntity {
    private String name;
    private BigDecimal price;
    private String description;
    private String picture;
}
