package com.example.demo.controller;

import com.example.demo.model.ChatMassage;
import lombok.Getter;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

@MessageMapping("/snedMassage")
@SendTo("/topic/message")


    //apSendMessage
    public ChatMassage sendMassage(ChatMassage chatMassage){

        return chatMassage;
    }


    @GetMapping
    public String getChatMassage(){
        return "chatMassage";
    }



}
