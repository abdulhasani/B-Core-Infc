package com.bebrayan.ngapak.core.facade;

import java.util.List;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author hasani
 * @param <T>
 */
public abstract class AbstractDatabaseFacade<T> implements DatabaseFacadeLocal<T> {

    private static final Logger logger = LoggerFactory.getLogger(AbstractDatabaseFacade.class);
    private Class<T> entityClass;

    public AbstractDatabaseFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public static String generateId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Override
    public Class<T> getEntityClass() {
        return this.entityClass;
    }

    @Override
    public String getEntityVar() {
        String name = getEntityClass().getSimpleName();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }

    @Override
    public T find(Object Id) {
        return getEntityManager().find(entityClass, Id);
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(getEntityClass()));
        return getEntityManager().createQuery(cq).getResultList();
    }

}
