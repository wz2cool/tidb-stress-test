package com.github.wz2cool.demo.tidbstresstest.controller;

import com.github.pagehelper.PageInfo;
import com.github.wz2cool.demo.tidbstresstest.model.dto.CommentDTO;
import com.github.wz2cool.demo.tidbstresstest.model.dto.UserDTO;
import com.github.wz2cool.demo.tidbstresstest.service.DatabaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api")
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

    @GetMapping("/comments")
    public List<CommentDTO> getComments(
            @RequestParam(defaultValue = "1") Integer pageIndex,
            @RequestParam(defaultValue = "20") Integer pageSize) {
        return databaseService.getComments(pageIndex, pageSize);
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers(
            @RequestParam(defaultValue = "1") Integer pageIndex,
            @RequestParam(defaultValue = "20") Integer pageSize) {
        return databaseService.getUsers(pageIndex, pageSize);
    }
}
