package com.bit.web.service;

import java.util.List;

import com.bit.web.domain.Order_DetailDTO;
import com.bit.web.serviceImpl.CustomerServiceImpl;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */
@Component
public interface Order_DetailService {
    public void addOrder_Detail(Order_DetailDTO Order_Detail);
    public List<Order_DetailDTO> findOrder_Detail(Order_DetailDTO Order_Detail);
    public List<Order_DetailDTO> findOrder_DetailByOption(Order_DetailDTO Order_Detail);
    public Order_DetailDTO findOrder_DetailByOrder_DetailId(Order_DetailDTO Order_Detail);
    public void updateOrder_Detail(Order_DetailDTO Order_Detail);
    public void deleteOrder_Detail(Order_DetailDTO Order_Detail);       
}

// CustomerService cs = new CustomerServiceImpl()
// type정리