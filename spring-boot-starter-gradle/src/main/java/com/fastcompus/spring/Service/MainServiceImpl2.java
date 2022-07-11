package com.fastcompus.spring.Service;

import com.fastcompus.spring.properties.MainProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MainServiceImpl2 implements MainService {

    private static final String PRINTED = "printed -> ";

    @Value("${lang.korean.code}") // 단일 환경변수
    private String langCode;

    private final MainProperties mainProperties;

    @Override
    public String printText(String text) {
        return PRINTED + mainProperties.getEnglish().getCode() + text + ", " + this.toString();
    }

}
