package com.example.SpringBootDemoMySql.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootDemoMySql.service.MysqlService;
import com.example.SpringBootDemoMySql.domain.UserInfo;
import com.example.SpringBootDemoMySql.repository.MysqlDAO;

@Service
public class MysqlServiceImpl implements MysqlService {

    @Autowired
    private MysqlDAO mySqlDAO;

    @Override
    public UserInfo getUser(String username) {
        return mySqlDAO.getUserInfo(username);
    }
}
