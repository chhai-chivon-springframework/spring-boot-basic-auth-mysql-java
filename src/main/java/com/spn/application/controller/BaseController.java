package com.spn.application.controller;

import org.springframework.http.ResponseEntity;

import java.util.Map;

/**
 * @author Chhai Chivon on 07-May-18
 */
public interface BaseController<T> {

    ResponseEntity<Map<String,Object>> findAll(int page,int limit);

    ResponseEntity<Map<String,Object>> findById(Long id);

    ResponseEntity<Map<String,Object>> save(T entity);

    ResponseEntity<Map<String,Object>> Update(Long id, T entity);

    ResponseEntity<Map<String,Object>> delete(Long id);
}
