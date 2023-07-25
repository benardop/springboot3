package com.benard.learningspringboot3.springboot3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomeController {

    record Video(String name) {}

    List<Video> videos = List.of(
            new Video("Need help with your Spring Boot 3"),
            new Video("Don't do this in your code"),
            new Video("Secrets to fixing your code"));

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("videos", videos);
        return "index";
    }
}
