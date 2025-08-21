package net.frey.smartbar.backoffice.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@jakarta.persistence.Table(
        name = "Sbo_Table",
        uniqueConstraints = {@UniqueConstraint(columnNames = "name")})
public class Table extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer seatCount;

    @Column(nullable = false)
    private Boolean active;
}
