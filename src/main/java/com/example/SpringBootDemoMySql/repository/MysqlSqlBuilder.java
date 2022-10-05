package com.example.SpringBootDemoMySql.repository;

public class MysqlSqlBuilder {
    
    public String getUserInfo() {
        return "SELECT username, email FROM userinfo where username = #{username}";
    }
}
