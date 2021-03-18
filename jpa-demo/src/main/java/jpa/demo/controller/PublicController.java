package jpa.demo.controller;

import jpa.demo.entity.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * /public 不需要携带token
 */
@RestController()
@RequestMapping("/public")
public class PublicController {

    @PostMapping(path = "/test")
    public Result publicTest(){
        return Result.Success("publicTest","ojbk");
    }


    @PostMapping(path = "/testException")
    public Result publicTestException(){
        int i = 1;
//        i = i / 0;
        return Result.Success("publicTest","ojbk");
    }
}
