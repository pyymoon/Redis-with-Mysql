package com.ooyy.jdbc;

import com.ooyy.User;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserJdbc extends NamedParameterJdbcDaoSupport{
    @Autowired
    private Jedis jedis;
    //从redis中读出所有的userName，逐条写入mysql中
    public void register(){
        Set<String> set = jedis.keys("*");
        for (String str:set
             ) {
            Map<String,String> map = new HashMap<String, String>();
            map = jedis.hgetAll(str);
            String sql = "INSERT INTO user(userName,password,address,phoneNumber) values (:userName,:password,:address,:phoneNumber)";
            getNamedParameterJdbcTemplate().update(sql,map);
        }
    }

    public int login(User user){
        String sql = "select" + " password from user where userName=?";
        String userName = user.getUserName();
        String pw = getJdbcTemplate().queryForObject(sql,new Object[]{userName},String.class);
        if (pw.equals( user.getPassword())){
            return 1;
        }
        else{
            return 0;
        }
    }
}
