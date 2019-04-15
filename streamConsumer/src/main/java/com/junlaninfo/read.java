package com.junlaninfo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 *  作者：xuexionghui
        邮箱：413669152@qq.com
        时间：2019年4月15日
        类作用：
 */
@Component
public class read {
	
	@StreamListener("my_stream_channel")
	public void listener(String msg ) {
		System.out.println("消费者获取生产消息:" + msg);
	}

}
