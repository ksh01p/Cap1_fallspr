package com.example.demo.dto;
import com.example.demo.domain.Faq;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class FaqDto {

    @Setter
    @Getter
    public static class CreateReqDto {
        private String title;
        private String content;

        public Faq toEntity(){

            return Faq.of(getTitle(), getContent());
        }
    }
    @Setter
    @Getter
    public static class UpdateReqDto {
        private Long id;
        private String title;
        private String content;
    }
    @Builder
    @Setter
    @Getter
    public static class CreateResDto {
        private Long id;
    }

    @Setter
    @Getter
    public static class DetailResDto {
        private Long id;
        private String title;
        private String content;
    }

}