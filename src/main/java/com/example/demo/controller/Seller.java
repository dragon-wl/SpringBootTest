package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanglong
 * @time 2021/2/18/
 * @ref
 */
@RequestMapping("/seller")
@Controller
public class Seller {

    @GetMapping("/sell")
    public void callSeller (){
        System.out.println("** 请求成功，这是controller下的Seller **");
    }
}
