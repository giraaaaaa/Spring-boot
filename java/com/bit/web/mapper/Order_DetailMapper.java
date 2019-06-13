package com.bit.web.mapper;

import java.util.List;

import com.bit.web.domain.Order_DetailDTO;

import org.springframework.stereotype.Repository;

/**
 * EmpoyeeMapper
 */
@Repository
public interface Order_DetailMapper {
    public void addOrder_Detail(Order_DetailDTO Order_Detail);
    public List<Order_DetailDTO> selectOrder_Detail(Order_DetailDTO Order_Detail);
    public List<Order_DetailDTO> selectOrder_DetailByOption(Order_DetailDTO Order_Detail);
    public Order_DetailDTO selectOrder_DetailByOrder_DetailId(Order_DetailDTO Order_Detail);
    public void updateOrder_Detail(Order_DetailDTO Order_Detail);
    public void deleteOrder_Detail(Order_DetailDTO Order_Detail);       

    
}