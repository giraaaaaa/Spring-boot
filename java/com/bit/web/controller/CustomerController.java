package com.bit.web.controller;

import com.bit.web.domain.CustomerDTO;
import com.bit.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CoustomerController
 */
@RestController
public class CustomerController {
    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customer;
    
    @RequestMapping("/count")
    public String index() {
        System.out.println("CustomerController count() 경로로 들어옴");
        int count = customerService.countAll();
        System.out.println("고객의 총인원 : " + count);
        return count+"";
    }

    @RequestMapping("/login/{customerId}/{password}")
    public String login(@PathVariable("customerId")String id,
                        @PathVariable("password")String pass) {
        System.out.println("ajax로 넘어온 ID : " + id);
        System.out.println("ajax로 넘어온 PW : " + pass);
        customer.setCustomerId(id);
        customer.setPassword(pass);
        System.out.println("DB에서 넘어온 이름 : " + customerService.login(customer).getCustomerName());
        
        return (customerService.login(customer) != null) 
                ? "SUCCESS" : "Fail";
    }
}