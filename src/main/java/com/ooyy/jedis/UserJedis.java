package com.ooyy.jedis;

import com.ooyy.User;
import com.ooyy.jdbc.UserJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;


public class UserJedis {
    @Autowired
    private Jedis jedis;
    @Autowired
    private UserJdbc userJdbc;
    //注册，用户输入写入redis中，如果redis中已有该用户名，则返回0，若写入成功则返回1
    public int register(User user){

        Map<String,String> map = new HashMap<String, String>();
        map.put("userName",user.getUserName());
        map.put("password",user.getPassword());
        map.put("address",user.getAddress());
        map.put("phoneNumber",user.getPhoneNumber().toString());
        if(jedis.hget(user.getUserName(),"userName") != null){
            return 0;
        }
        else{
            jedis.hmset(user.getUserName(),map);
        }
        return 1;
    }

    public void update(){
        userJdbc.register();
    }
}
