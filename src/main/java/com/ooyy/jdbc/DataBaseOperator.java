package com.ooyy.jdbc;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.util.HashMap;
import java.util.Map;
import com.ooyy.Student;
import redis.clients.jedis.Jedis;

public class DataBaseOperator extends NamedParameterJdbcDaoSupport {
    //    private JdbcTemplate jdbcTemplateObject;
//    private JedisController jc;

//    public void setJc(JedisController jc) {
//        this.jc = jc;
//    }


    public void create(Student student){
        Jedis jedis = new Jedis("localhost");
        Map<String,String> para= new HashMap<String,String>();
        para = jedis.hgetAll(student.getName());
        String sql = "INSERT into student(name,addr,age) values (:name,:addr,:age)";
        getNamedParameterJdbcTemplate().update(sql,para);
    }

//    public void create(Student student){
////        jc.create(student);
//        String sql = "INSERT into student(name,age) values (:name,:age)";
//        Map<String,Object> para= new HashMap<String,Object>();
//        para.put("name",student.getName());
//        para.put("age",student.getAge());
////        para.put("addr",student.getAddr());
//
//        getNamedParameterJdbcTemplate().update(sql,para);
//    }

//    public Student getStudent(Integer id) {
//        String SQL = "select * from Student where id=?";
//        Student student = getJdbcTemplate().queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<>(Student.class));
//        return student;
////        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id",id);
////        Map<String,Object> out = jdbcCall.execute(in);
////        Student student = new Student();
////        student.setId(id);
////        student.setName((String) out.get("out_name"));
////        student.setAge((Integer) out.get("out_age"));
////        return student;
//    }

    public Integer getId(Student student){
//        jc.create();

        String SQL = "select id from student where name=?";
        String name = student.getName();
//        String addr = student.getAddr();
        Integer age = student.getAge();
        Integer id = getJdbcTemplate().queryForObject(SQL,new Object[]{name},Integer.class);
//        Integer id = getJdbcTemplate().queryForObjec
        return id;
    }
}
