package com.deepthi.resumescrening.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeController {

    @GetMapping("/health")
    public String health() {
        return "AI Resume Screening Application Running";
    }
}
