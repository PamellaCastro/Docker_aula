package com.example.doker_app;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/app")

public class HomeController {
    @GetMapping("/hello")
    public String hello() {
        return "Oie Mundo!";
    }
}
