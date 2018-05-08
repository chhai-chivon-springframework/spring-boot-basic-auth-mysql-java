package com.spn.application.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @author Chhai Chivon on 07-May-18
 */
public interface BaseService<T> {

    Page<T> findAll(PageRequest pageRequest);

    T findOne(Long id);

    T saveOrUpdate(T entity);

    T delete(Long id);

    boolean exists(Long id);
}
