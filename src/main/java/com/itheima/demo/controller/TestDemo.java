package com.itheima.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestDemo {

    @RequestMapping("/demo")
    @ResponseBody
    public String getString(){
        return "1234";
    }

    @RequestMapping("/demofreemarker")
    public String showPage(Model model){
        model.addAttribute("hello","hello demofreemarker!!");
        return "hello";
    }

}
