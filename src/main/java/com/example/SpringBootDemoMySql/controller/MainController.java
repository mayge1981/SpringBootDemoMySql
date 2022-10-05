package com.example.SpringBootDemoMySql.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootDemoMySql.domain.UserInfo;
import com.example.SpringBootDemoMySql.service.MysqlService;

@RestController
public class MainController {
    
    @Autowired
    private MysqlService mysqlService;

    @GetMapping("/test")
    public HttpEntity<String> getTest(){
        return ResponseEntity.ok("From Controller");
    }

    @GetMapping("/getUserInfo")
    public HttpEntity<UserInfo> getUserInfo(@Param("username") String username) {
        return ResponseEntity.ok(mysqlService.getUser(username));
    }

}
