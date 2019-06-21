package com.bit.web.serviceImpl;

import java.util.List;

import com.bit.web.common.util.PageProxy;
import com.bit.web.domain.CustomerDTO;
import com.bit.web.mapper.CustomerMapper;
import com.bit.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired CustomerMapper customerMapper;

    @Override
    public void insertCustomer(CustomerDTO customer) {
        customerMapper.insertCustomer(customer);
    }

    @Override
    public List<CustomerDTO> findCustomers(PageProxy pxy) {
        return customerMapper.selectCustomers(pxy);
    }

    @Override
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {
        customerMapper.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {
        customerMapper.deleteCustomer(customer);
    }

    @Override
    public int countAll() {
        return customerMapper.selectCount();
    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {
        System.out.println("컨트롤러에서 넘어온 ID : "+customer.getCustomerId());
        System.out.println("컨트롤러에서 넘어온 ID : "+customer.getPassword());
        return customerMapper.login(customer); 
    }

    
}
