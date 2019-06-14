package com.bit.web.controller;

import com.bit.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CoustomerController
 */
@RestController
public class CoustomerController {
    @Autowired CustomerService customerService;
    @RequestMapping("/count")
    public String index() {
        System.out.println("CustomerController count() 경로로 들어옴");
        int count = customerService.countAll();
        System.out.println("고객의 총인원 : " + count);
        return count+"";


    }
    
}