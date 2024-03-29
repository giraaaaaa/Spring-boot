package com.bit.web.mapper;

import java.util.List;
import com.bit.web.domain.OrderDTO;

import org.springframework.stereotype.Repository;

/**
 * EmpoyeeMapper
 * 
 * @param <OrderDTO>
 */
@Repository
public interface OrderMapper {
    public void addOrder(OrderDTO Order);
    public List<OrderDTO> selectOrder(OrderDTO Order);
    public List<OrderDTO> selectOrderByOption(OrderDTO Order);
    public OrderDTO selectOrderByOrderId(OrderDTO Order);
    public void updateOrder(OrderDTO Order);
    public void deleteOrder(OrderDTO Order);  
}
