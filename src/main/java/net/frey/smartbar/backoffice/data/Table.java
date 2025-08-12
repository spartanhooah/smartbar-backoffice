package net.frey.smartbar.backoffice.data;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@jakarta.persistence.Table(name = "Sbo_Table")
public class Table extends BaseEntity {
    private String name;
    private Integer seatCount;
    private Boolean active;
}
