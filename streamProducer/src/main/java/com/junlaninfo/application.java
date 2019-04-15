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
@EnableBinding(SendMessageInterface.class)
public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(application.class, args);

	}

}
