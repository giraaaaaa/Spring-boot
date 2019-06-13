package com.bit.web.domain;

import lombok.Data;

/**
 * EmpoyeeDTO
 */
@Data
public class EmpoyeeDTO {
    private String employeeId,
                    manager,
                    name,
                    birthDate,
                    photo,
                    notes;
    
}
