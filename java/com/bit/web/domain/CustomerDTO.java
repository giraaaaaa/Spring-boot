package com.bit.web.domain;

import lombok.Data;

/**
 * CustomerDTO
 */
@Data
public class CustomerDTO {
    private String customerId,
                    customerName,
                    passWord ,
                    ssn,
                    phone,
                    city,
                    address,
                    postalcode,
                    photo;
    
}
