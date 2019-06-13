package com.bit.web.domain;

import lombok.Data;

/**
 * OderDTO
 */
@Data
public class OderDTO {
    private String orderId,
                    customerId,
                    employeeId,
                    orderDate,
                    shipperId;
  
}