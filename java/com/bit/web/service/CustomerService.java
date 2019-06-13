package com.bit.web.service;

import java.util.List;

import com.bit.web.domain.CustomerDTO;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */
@Component
public interface CustomerService {
    public void addCustomer(CustomerDTO Customer);
    public List<CustomerDTO> findCustomer(CustomerDTO Customer);
    public List<CustomerDTO> findCustomerByword(CustomerDTO Customer);
    public CustomerDTO findCustomerByCustomerId(CustomerDTO Customer);
    public void updateCustomer(CustomerDTO Customer);
    public void deleteCustomer(CustomerDTO Customer);
}

// CustomerService cs = new CustomerServiceImpl()
// type정리