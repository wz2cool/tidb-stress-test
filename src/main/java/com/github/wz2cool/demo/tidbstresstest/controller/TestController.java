package com.github.wz2cool.demo.tidbstresstest.controller;

import com.github.wz2cool.demo.tidbstresstest.service.DatabaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/test")
public class TestController {
    @Resource
    private DatabaseService databaseService;

    @GetMapping("/")
    public String SayHello() {
        return "Hello world";
    }


    @GetMapping("/userCount")
    public Long getUserCount() {
        return databaseService.getUserCount();
    }
}
