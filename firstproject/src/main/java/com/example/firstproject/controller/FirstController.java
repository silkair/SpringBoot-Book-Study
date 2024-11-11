package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class FirstController {
    @GetMapping("/hi") //url 요청 접수
    public String NiceToMeetYou(Model model) {
        model.addAttribute("username", "이친당");
        return "greeting"; // greeting.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String SeeYouNext(Model model) {
        return "goodbye";
    }
}
