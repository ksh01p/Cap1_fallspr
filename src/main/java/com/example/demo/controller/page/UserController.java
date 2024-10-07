package com.example.demo.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {

    //PathVariable => url에 있는 값을 변수로 받아올수 있는 기능!!
    @GetMapping("/{page}")
    public String page(@PathVariable String page){
        return "user/" + page;
    }

    //PathVariable을 여러개 쓸수 있음.. 대신 /가 있어야함!
    @GetMapping("/{page}/{id}")
    public String page2(@PathVariable String page, @PathVariable String id){
        return "user/" + page;
    }
}