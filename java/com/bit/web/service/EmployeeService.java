package com.bit.web.service;

import java.util.List;

import com.bit.web.domain.EmployeeDTO;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */
@Component
public interface EmployeeService {
    public void addEmpoyee(EmployeeDTO employee);
    public List<EmployeeDTO> findEmployees(EmployeeDTO employee);
    public List<EmployeeDTO> findEmployeesByOption(EmployeeDTO employee);
    public EmployeeDTO findEmployeeBEmployeeId(EmployeeDTO employee);
    public void updateEmployee(EmployeeDTO employee);
    public void deleteEmployee(EmployeeDTO employee);
    
}

// CustomerService cs = new CustomerServiceImpl()
// type정리