package com.haneul.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication // 자동 설정, 스프링 Bean 읽기와 생성 모두 자동으로 설정해줌
public class Application {

    public static void main(String[] args) {
        // 내장 WAS를 사용할 수 있게 해줌 - 장점 : 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있다.
        // 외장 WAS를 사용하게 되면 모든 서버는 버전, 설정을 일치시켜야만 하는데, 내장 WAS를 사용하게 되면 이런 번거로움이 준다.
        SpringApplication.run(Application.class, args);
    }
}
