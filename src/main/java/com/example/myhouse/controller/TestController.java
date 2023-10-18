package com.example.myhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @GetMapping("/main")
    public ModelAndView  test() {
        System.out.println("수행됨****************");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index");
        return mv;
    }
}
