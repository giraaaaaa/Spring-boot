package com.bit.web.serviceImpl;

import java.util.List;

import com.bit.web.domain.CustomerDTO;
import com.bit.web.service.CustomerService;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void addCustomer(CustomerDTO Customer) {

    }

    @Override
    public List<CustomerDTO> findCustomer(CustomerDTO Customer) {
        return null;
    }

    @Override
    public List<CustomerDTO> findCustomerByOption(CustomerDTO Customer) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByCustomerId(CustomerDTO Customer) {
        return null;
    }

    @Override
    public void updateCustomer(CustomerDTO Customer) {

    }

    @Override
    public void deleteCustomer(CustomerDTO Customer) {

    }

    
}