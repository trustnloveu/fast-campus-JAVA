package com.fastcompus.spring.Controller;

import com.fastcompus.spring.Service.MainServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MainController {

    private final MainServiceImpl mainService; // MainService 인터페이스 구현체

    @GetMapping("/api/v1/test")
    public String test(@RequestParam String text) {
        return mainService.printText(text);
    }

}

