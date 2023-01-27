package com.example.demo.rest;

import com.example.demo.Application;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestartController {

    @PostMapping("/restart")
    public void restart() {
        Application.restart();
    }
}
