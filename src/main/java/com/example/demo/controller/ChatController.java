package com.example.demo.controller;

import com.example.demo.model.ChatMassage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

@MessageMapping("/snedMassage")
@SendTo("/topic/message")


    //apSendMessage
    public ChatMassage sendMassage(ChatMassage chatMassage){

        return chatMassage;
    }



}
