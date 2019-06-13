package com.bit.web.serviceImpl;


import java.util.List;

import com.bit.web.domain.OrderDTO;
import com.bit.web.service.OrderService;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public void addOrder(OrderDTO Order) {

    }

    @Override
    public List<OrderDTO> findOrder(OrderDTO Order) {
        return null;
    }

    @Override
    public List<OrderDTO> findOrderByOption(OrderDTO Order) {
        return null;
    }

    @Override
    public OrderDTO findOrderByOrderId(OrderDTO Order) {
        return null;
    }

    @Override
    public void updateOrder(OrderDTO Order) {

    }

    @Override
    public void deleteOrder(OrderDTO Order) {

    }

    
}