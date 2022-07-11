package com.fastcompus.spring.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("lang")
public class MainProperties {

    private Korean korean;
    private English english;

    @Getter
    @Setter
    public static class Korean {
        private String code;
    }

    @Getter
    @Setter
    public static class English {
        private String code;
    }
}
