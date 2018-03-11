package com.dreammakerteam.community.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示控制器
 * @author ty
 * @date 2018/3/11 下午 10:43
 */
@RestController
@RequestMapping
public class DemoController {

    @RequestMapping
    public String demo() {
        return "demo";
    }

}
