package com.zhihao.miao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/16
 * @since 1.0
 */
@RestController
public class UserController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${check.uri}")
    private String checkurl;

    @GetMapping("/index")
    public String index(){
        log.info("username="+username+",check.uri=="+username);
        return "username="+username+",check.uri==="+checkurl;
    }
}
