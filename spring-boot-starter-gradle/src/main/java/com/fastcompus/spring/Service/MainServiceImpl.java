package com.fastcompus.spring.Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class MainServiceImpl implements MainService {

    private static final String PRINTED = "printed -> ";

    @Value("${lang.korean.code}") // 단일 환경변수
    private String langCode;

    @Override
    public String printText(String text) {
        return PRINTED + text + ", " + this.toString();
    }

}
