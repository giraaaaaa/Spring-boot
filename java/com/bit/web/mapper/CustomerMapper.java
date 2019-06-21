package com.bit.web.mapper;

import java.util.List;

import com.bit.web.common.util.PageProxy;
import com.bit.web.domain.CustomerDTO;

import org.springframework.stereotype.Repository;

/**
 * CustomerMapper
 */
@Repository
public interface CustomerMapper {
    public void insertCustomer(CustomerDTO customer);
    public List<CustomerDTO> selectCustomers(PageProxy pxy);
    public List<CustomerDTO> selectCustomersByOption(CustomerDTO option);
    public CustomerDTO selectCustomerByCustomerId(String customerId);
    public void updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
    public int selectCount();
    public CustomerDTO login(CustomerDTO customer);
    //로그인할때 id pw정보를 모두 보내야하기때문에 login전체정보를 mapping해야한다.
    
}
