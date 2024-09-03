package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

/*

controller service DAO
controller : request & respond 를 보내고 받는
service : 연산 처리
dao : db 연관

build.gradle --> dependancy 처리
application.properties --> yml, yaml 파일로 바꾸면 확장자명을 자동으로 변화함
spring component 이슈 처리

request 방식
1. Page Conrtoller : url pathing feature, 페이지가 이동해야 함
2. Rest Controller : page는 변화 없이 데이터만 이동하는 방식
ex) 카카오톡 페이지 창은 그대로인데 카톡 메세지만 위아래로 나오는 것

Web & App 서비스를 위한 , Rest & Pull 방식 선호
admin 프론트..

server에 프론트 html을 넣는 방식을 택할 것 : thymeleaf 사용(front end admin을 위헤서 사용 예정)

500 Error 뜨면 나의 서버 잘못
400 Error 면 컴퓨터의 잘못

Controller - PageController, RestController .. Parameter가 많은 경우에는 Collection List, HashMap 사용


*/
