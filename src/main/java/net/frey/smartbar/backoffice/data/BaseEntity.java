package net.frey.smartbar.backoffice.data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    @Id
    @SequenceGenerator(sequenceName = "entity_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
}
