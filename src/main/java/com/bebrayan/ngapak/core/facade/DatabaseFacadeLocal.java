package com.bebrayan.ngapak.core.facade;

import java.util.List;

/**
 *
 * @author hasani
 */
public interface DatabaseFacadeLocal<T> {

    public T find(Object Id);

    public List<T> findAll();

    public Class<T> getEntityClass();

    public String getEntityVar();
}
