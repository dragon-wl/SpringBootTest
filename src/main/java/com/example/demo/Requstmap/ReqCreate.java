package com.example.demo.Requstmap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanglong
 * @time 2021/2/18/
 * @ref
 */
@Controller
@RequestMapping("/req")
public class ReqCreate {

    @GetMapping("create")
    public void createReq(){
        System.out.println("** 请求成功，这里是ReqCreate **");
    }
}
