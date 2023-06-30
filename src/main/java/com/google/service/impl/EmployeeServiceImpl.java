package com.google.service.impl;

import com.google.entities.EmployeeEntity;
import com.google.persistence.EmployeeRepository;
import com.google.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Dentro de esta clase se van a implementar los metodos definos en la interfaz EmployeeService.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    //Inyectar capa de persistencia para poder guardar la informacion..
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity findById(Long id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    @Override
    public void createEmployee(EmployeeEntity employeeEntity) {
        employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
