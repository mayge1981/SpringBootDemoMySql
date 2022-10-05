package com.example.SpringBootDemoMySql.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import com.example.SpringBootDemoMySql.domain.UserInfo;

@Mapper
public interface MysqlDAO {    

    @SelectProvider(type = MysqlSqlBuilder.class, method = "getUserInfo")
    UserInfo getUserInfo(@Param("username") String username);
}
