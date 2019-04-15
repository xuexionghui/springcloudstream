package com.junlaninfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 *  作者：xuexionghui
        邮箱：413669152@qq.com
        时间：2019年4月15日
        类作用：
 */
@SpringBootApplication
@EnableBinding(readMsg.class)
public class application {

	public static void main(String[] args) {
		SpringApplication.run(application.class, args);

	}

}
