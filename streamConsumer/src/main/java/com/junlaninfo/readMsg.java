package com.junlaninfo;
/**
 *  作者：xuexionghui
        邮箱：413669152@qq.com
        时间：2019年4月15日
        类作用：
 */

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface readMsg {
	@Input("my_stream_channel")
	SubscribableChannel  readMsg();

}
