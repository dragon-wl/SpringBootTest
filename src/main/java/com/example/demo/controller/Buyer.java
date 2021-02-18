package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanglong
 * @time 2021/2/18/
 * @ref
 * https://blog.csdn.net/u013083284/article/details/83475575
 */
@RestController
@RequestMapping("/buyer")
public class Buyer {

    @GetMapping("/buy")
    public void callBuyer() {

        System.out.println(" ** 请求成功，这里是Controller下的Buyer **");

    }
}
