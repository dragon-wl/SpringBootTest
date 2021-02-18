package com.example.demo.controller.sub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanglong
 * @time 2021/2/18/
 * @ref
 */
@RestController
@RequestMapping("/seller")
public class SubSeller {

    /**
     * 仅可命中"拦截以call开头的任意方法"
     */
    @GetMapping("/subSeller")
    public void callSubSeller() {
        System.out.println(" **  请求成功，这是controller 子包 中的subSeller类 ** ");
    }
}
