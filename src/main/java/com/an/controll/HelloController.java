package com.an.controll;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWord(){
        log.info("hello 请求");
        return "hello,spring boot2";
    }
}
