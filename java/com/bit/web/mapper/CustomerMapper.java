package com.bit.web.mapper;

import java.util.List;
import com.bit.web.domain.CustomerDTO;

import org.springframework.stereotype.Repository;

/**
 * CustomerMapper
 * 
 * @param <CustomerDTO>
 */
@Repository
public interface CustomerMapper<CustomerDTO> {
    public void addCustomer(CustomerDTO Customer);
    public List<CustomerDTO> selectCustomer(CustomerDTO Customer);
    public List<CustomerDTO> selectCustomerByOption(CustomerDTO Customer);
    public CustomerDTO selectCustomerByCustomerId(CustomerDTO Customer);
    public void updateCustomer(CustomerDTO Customer);
    public void deleteCustomer(CustomerDTO Customer);
}