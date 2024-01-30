package org.example.headhunter.service;

import java.util.List;

public interface Service<D> {
    List<D> getEntities();
    D getEntity(Integer id);
    D addEntity(D d);
    D updateEntity(Integer id, D d);
    void deleteEntity(Integer id);
}
