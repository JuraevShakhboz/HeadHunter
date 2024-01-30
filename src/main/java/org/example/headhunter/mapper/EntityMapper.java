package org.example.headhunter.mapper;

import java.util.List;

public interface EntityMapper<D, E>{
    E toEntity(D d);
    D toDTO(E e);
    List<E> toEntities(List<D> ds);
    List<D> toDTOs(List<E> es);
}
