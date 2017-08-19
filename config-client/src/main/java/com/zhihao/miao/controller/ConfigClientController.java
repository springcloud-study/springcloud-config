package com.zhihao.miao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/15
 * @since 1.0
 */

@RestController
public class ConfigClientController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${from}")
    private String from;

    @GetMapping("/index")
    public String index(){
        log.info("username="+username+",form=="+from);
        return "username="+username+",form=="+from;
    }
}
