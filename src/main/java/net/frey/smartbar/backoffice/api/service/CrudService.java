package net.frey.smartbar.backoffice.api.service;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.List;
import lombok.RequiredArgsConstructor;

@Transactional
@RequiredArgsConstructor
public abstract class CrudService<E> {
    private final EntityManager em;

    public E persist(E entity) {
        em.persist(entity);

        return entity;
    }

    public List<E> getAll(Class<E> sqlType) {
        return em.createQuery("Select e from " + sqlType.getSimpleName() + " e", sqlType)
                .getResultList();
    }

    public E get(Class<E> sqlType, Long id) {
        var query = em.createQuery("Select e from " + sqlType.getSimpleName() + " e where e.id = :id", sqlType);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    public void delete(Class<E> sqlType, Long id) {
        var table = em.find(sqlType, id);
        em.remove(table);
    }

    public void update(E objectToUpdate) {
        em.merge(objectToUpdate);
    }
}
