package org.anhu.serverWebSocket;

import org.anhu.elements.MessagePayload;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

	@MessageMapping("/create")
	@SendTo("/topic/creation")
	public MessagePayload createGame(MessagePayload load) {
		System.out.println(load);
		return load;
	}

}