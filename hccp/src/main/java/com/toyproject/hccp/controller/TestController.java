package com.toyproject.hccp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class TestController {

    @GetMapping(value = "/test/home")
    public String testHome(){
        log.info("Test Home 출력테스트");
        return "Test";
    }

}
