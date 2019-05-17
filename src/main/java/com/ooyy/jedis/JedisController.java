package com.ooyy.jedis;

import com.ooyy.Student;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import com.ooyy.jdbc.DataBaseOperator;

import java.util.HashMap;
import java.util.Map;

public class JedisController {
    private DataBaseOperator dataBaseOperator;

    @Autowired
    public void setDataBaseOperator(DataBaseOperator dataBaseOperator) {
        this.dataBaseOperator = dataBaseOperator;
    }

    public void create(Student student) {
        Jedis jedis = new Jedis("localhost");
        Map<String, String> para = new HashMap<String, String>();
        para.put("addr", student.getAddr());
        para.put("name", student.getName());
        para.put("age", student.getAge().toString());
//        para.put("id", student.getId().toString());
        String name = student.getName();
        jedis.hmset(name, para);
        dataBaseOperator.create(student);
    }

//    public void toSql(Student student){
//        dataBaseOperator.create(student);
//    }
}




//    public static void main(String[] args){
//        Jedis jedis = new Jedis("localhost");
//        Student student = new Student();
//        student.setAge(20);
//        student.setName("wp");
//
//        System.out.println(jedis.ping());
//
//        HashMap<String,String> para = new HashMap<String,String>();
//
//        para.put("name",student.getName());
//        System.out.println(para.get("name"));
//        jedis.hmset("wspn",para);


//        System.out.println(jedis.hgetAll("wspn"));

//        System.out.println(jedis.get("student"));
//
//        jedis.set("student","oyl");
//
//        System.out.println(jedis.get("student"));

