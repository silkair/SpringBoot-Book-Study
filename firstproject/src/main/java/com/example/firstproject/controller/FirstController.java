package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;

@Controller
public class FirstController {
    public String NiceToMeetYou() {
        return "greetings"; // greetings.mutache 파일 반환
    }
}
