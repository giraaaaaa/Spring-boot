package com.bit.web.domain;

import lombok.Data;

/**
 * Oder_DeatailDTO
 */
@Data
public class Oder_DeatailDTO {
    private String order_detailId,
                    orderId,
                    productId,
                    quantity;
}