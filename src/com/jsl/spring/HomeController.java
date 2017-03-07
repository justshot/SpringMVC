package com.jsl.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by shaoliang.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView  home(){
        return new ModelAndView("test", "message", "This is a message");
    }
}