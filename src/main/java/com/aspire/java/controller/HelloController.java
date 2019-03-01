package com.aspire.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiantuan
 * @creationDate 2019/2/28 - 16:02
 */
@Controller
//@RequestMapping(value={"/hello"})
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
