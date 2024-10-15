package com.example.demo.domain;
import com.example.demo.dto.FaqDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity


public class Faq {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id Long id;

    @Setter
    Long userId;//foreign key

    @Setter @Column(nullable=false)
    String title;
    @Setter
    String content;



    protected Faq(){

    }
    private Faq(Long userId,String title, String content){
        this.userId = userId;
        this.title=title;
        this.content=content;
    }
    //생성자는 그냥 안쓰고 싶음..of 라는 메서드를 통해서만 엑세스 인스턴스를 보내기로 함.
    public static Faq of(Long userId,String title, String content){
        return new Faq(userId,title,content);
    }

    public FaqDto.CreateResDto toCreateResDto() {
        return FaqDto.CreateResDto.builder().id(id).build();
    }
}
