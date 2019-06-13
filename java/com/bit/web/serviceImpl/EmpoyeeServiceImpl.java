package com.bit.web.serviceImpl;


import java.util.List;

import com.bit.web.domain.EmployeeDTO;
import com.bit.web.service.EmployeeService;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class EmpoyeeServiceImpl implements EmployeeService {

    @Override
    public void addEmpoyee(EmployeeDTO employee) {

    }

    @Override
    public List<EmployeeDTO> findEmployees(EmployeeDTO employee) {
        return null;
    }

    @Override
    public List<EmployeeDTO> findEmployeesByOption(EmployeeDTO employee) {
        return null;
    }

    @Override
    public EmployeeDTO findEmployeeBEmployeeId(EmployeeDTO employee) {
        return null;
    }

    @Override
    public void updateEmployee(EmployeeDTO employee) {

    }

    @Override
    public void deleteEmployee(EmployeeDTO employee) {

    }

    
}