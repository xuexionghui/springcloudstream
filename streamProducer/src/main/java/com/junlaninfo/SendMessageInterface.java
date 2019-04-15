package com.junlaninfo;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;


/**
 *  作者：xuexionghui
        邮箱：413669152@qq.com
        时间：2019年4月15日
        类作用：创建通道
        *
        */


public interface SendMessageInterface {
	 
	@Output("my_stream_channel")
	SubscribableChannel sendMsg();

}
