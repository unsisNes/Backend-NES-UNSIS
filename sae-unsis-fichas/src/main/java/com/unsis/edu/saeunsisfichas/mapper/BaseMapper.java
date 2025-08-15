package com.unsis.edu.saeunsisfichas.mapper;

import java.util.List;

public interface BaseMapper<D, R, E> { //D: dto response, R: dto request, E: entity
    E toEntity(R dto);
    D toDto(E entity);
    List<D> toDtos(List<E> entities);
    void updateEntity(R request, E entity);
}
