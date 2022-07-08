package com.fastcompus.spring.Service;

import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

    @Override
    public String printText(String text) { return text; }

}
