package net.frey.smartbar.backoffice.api.service;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Transactional
@RequiredArgsConstructor
public abstract class CrudService<E> {
    private final EntityManager em;

    public E persist(E entity) {
        em.persist(entity);

        return entity;
    }
}
