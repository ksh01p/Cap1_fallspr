package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Board {
    @Id
    Integer id;

    String title;
    String content;
    String author;
}

/*
DAO 의 종류

Repo / Mapper 2가지가 존재함.
Repo 는 자동_ Entity class 사용 , Mapper 는 수동
PK 를 위한 annotation은 @Id ..

primary key, foreign key , unique key

*/

