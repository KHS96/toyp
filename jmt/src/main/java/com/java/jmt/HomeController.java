package com.java.jmt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("testm","테스트메시지입니다");
        return "test";
    }

    @ResponseBody
    @RequestMapping("/valueTest")
    public String valueTest(){
        String value = "테스트메시지";
        return value;
    }
}
