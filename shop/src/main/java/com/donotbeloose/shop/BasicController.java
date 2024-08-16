package com.donotbeloose.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;

@Controller // 클래스에 붙이면 아래서 서버 만들 수 있음
public class BasicController {

    @GetMapping("/") // 이 URL에 접속하면 아래가 나온당
    String helloFunc() {
        // ResponseBody 없으면 파일을 보내라는 것
        return "index.html";
    }

    @GetMapping("/about") // 이 URL에 접속하면 아래가 나온당
    @ResponseBody // ResponseBody 있으면 리턴값 보내라는 것
    String aboutFunc() {
        return "8년을 기다렸습니다";
    }

    @GetMapping("/jaehyun") // 이 URL에 접속하면 아래가 나온당
    @ResponseBody
    String jaehyunFunc() { // html 보내려면 걍 쓰면됨
        return "<h1>정재현솔로핫데뷔</h1>";
    }

    @GetMapping("/date")
    @ResponseBody
    String date() {
        return ZonedDateTime.now().toString();
    }
}
