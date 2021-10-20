package com.ikairui.captcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CaptchaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaptchaAppApplication.class, args);
    }

}
