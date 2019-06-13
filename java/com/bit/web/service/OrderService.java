package com.bit.web.service;

import java.util.List;

import com.bit.web.domain.OrderDTO;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */
@Component
public interface OrderService {
    public void addOrder(OrderDTO Order);
    public List<OrderDTO> findOrder(OrderDTO Order);
    public List<OrderDTO> findOrderByOption(OrderDTO Order);
    public OrderDTO findOrderByOrderId(OrderDTO Order);
    public void updateOrder(OrderDTO Order);
    public void deleteOrder(OrderDTO Order);
    
    
}

// CustomerService cs = new CustomerServiceImpl()
// type정리