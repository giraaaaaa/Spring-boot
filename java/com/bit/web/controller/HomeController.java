package com.bit.web.controller;

import com.bit.web.common.util.Printer;
import com.bit.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {
    @Autowired CustomerService customerService; 
    @Autowired Printer p;
    @RequestMapping("/")   
    public String index() {
        p.accecpt("루트 URL 경로로 들어옴");
        int count = customerService.countAll();
        p.accecpt("람다가 출력한 고객의 총인원 : "+ count);
        return "index";
    }
  
}
