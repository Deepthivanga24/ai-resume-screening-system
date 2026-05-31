package com.deepthi.resumescrening.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/resume")
public class UploadController {

    @PostMapping("/upload")
    public String uploadResume(@RequestParam("file") MultipartFile file) {

        return "Resume Uploaded Successfully : " + file.getOriginalFilename();
    }
}
