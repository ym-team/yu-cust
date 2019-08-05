package com.hmn.ym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer/")
public class CustomerController extends BaseController {

    @GetMapping("toAdd")
    public String StoreEnterView() {
        return "/customer/customerView";
    }
}
