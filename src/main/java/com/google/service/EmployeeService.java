package com.google.service;

import com.google.entities.EmployeeEntity;

import java.util.List;

/**
 * Dentro de esta clase se colocan lo metodos basicos del crud.
 */
public interface EmployeeService {

    List<EmployeeEntity> findAll();
    EmployeeEntity findById(Long id);
    void createEmployee(EmployeeEntity employeeEntity);
    void deleteEmployeeById(Long id);
}
