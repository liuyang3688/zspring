package com.leotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("webgl")
    public String hello()
    {
        return "webgl";
    }
    @RequestMapping("page_two")
    public String pageTwo()
    {
        return "page_two";
    }
    @RequestMapping("page_three")
    public String pageThree()
    {
        return "page_three";
    }
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
}
