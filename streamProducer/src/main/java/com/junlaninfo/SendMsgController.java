package com.junlaninfo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  作者：xuexionghui
        邮箱：413669152@qq.com
        时间：2019年4月15日
        类作用：
 */
@RestController
public class SendMsgController {
	@Autowired
	private SendMessageInterface sendMessageInterface;

	@RequestMapping("/sendMsg")
	public String sendMsg() {
		String msg = UUID.randomUUID().toString();
		System.out.println("生产者发送内容msg:" + msg);
		Message build = MessageBuilder.withPayload(msg.getBytes()).build();
		sendMessageInterface.sendMsg().send(build);
		return "success";
	}

}
