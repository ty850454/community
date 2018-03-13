package com.dreammakerteam.community.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章控制器
 * @author ty
 * @date 2018/3/13 下午 9:29
 */
@RestController
@RequestMapping("/post")
public class PostController {

    @RequestMapping
    public String post() {
        return "post";
    }
}
