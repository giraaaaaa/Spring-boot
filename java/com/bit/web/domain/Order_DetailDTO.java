package com.bit.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * Oder_DeatailDTO
 */
@Data @Component @Lazy
public class Order_DetailDTO {
    private String order_detailId,
                    orderId,
                    productId,
                    quantity;
}