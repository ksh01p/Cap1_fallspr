package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RequestMapping("")
@Controller

public class DefaultController {
    @GetMapping("/index")//얘를 주소로 찾아오면 밑에를 실행시키겠다, 이 안에 주소는 중복해서 사용 !
    public String index(){
        return "index";//이러면 resources 밑에 templates 밑에 index.html을 pathing 해준다는 뜻
    }
}

/*
* class mapping안에서만 우니크
* */



