package com.bit.web.mapper;

import java.util.List;

import com.bit.web.domain.EmployeeDTO;

import org.springframework.stereotype.Repository;

/**
 * EmpoyeeMapper
 */
@Repository
public interface EmployeeMapper {
    public void addEmpoyee(EmployeeDTO employee);
    public List<EmployeeDTO> findEmployees(EmployeeDTO employee);
    public List<EmployeeDTO> findEmployeesByOption(EmployeeDTO employee);
    public EmployeeDTO findEmployeeBEmployeeId(EmployeeDTO employee);
    public void updateEmployee(EmployeeDTO employee);
    public void deleteEmployee(EmployeeDTO employee);

    
}