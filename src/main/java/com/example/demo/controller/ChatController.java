package com.example.demo.controller;

import com.example.demo.model.ChatMassage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/message")
    public ChatMassage sendMassage(ChatMassage chatMassage){
        // Ensure the message has proper sender info
        return chatMassage;
    }

    @GetMapping("/")
    public String getChatPage(){
        return "chat";
    }
}