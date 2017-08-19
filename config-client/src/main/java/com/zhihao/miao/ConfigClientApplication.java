package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther : 苗志浩 (zhihao.miao@ele.me)
 * @Date :2017/8/11
 * @since 1.0
 */
//@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }


}
