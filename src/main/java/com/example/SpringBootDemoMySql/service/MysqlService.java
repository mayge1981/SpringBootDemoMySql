package com.example.SpringBootDemoMySql.service;

import com.example.SpringBootDemoMySql.domain.UserInfo;

public interface MysqlService {
 
    UserInfo getUser(String username);
}
