package com.dreammakerteam.community.post.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    @RequestMapping
    public String post() {
        return "post";
    }
}
