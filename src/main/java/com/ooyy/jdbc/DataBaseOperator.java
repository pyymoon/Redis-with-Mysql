package com.ooyy.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.util.HashMap;
import java.util.Map;
import com.ooyy.Student;

public class DataBaseOperator extends NamedParameterJdbcDaoSupport {
    //    private JdbcTemplate jdbcTemplateObject;
    public void create(Student student){
        String sql = "INSERT into student(name,age) values (:name,:age)";
        Map<String,Object> para= new HashMap<String,Object>();
        para.put("name",student.getName());
        para.put("age",student.getAge());

        getNamedParameterJdbcTemplate().update(sql,para);
    }

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
        String SQL = "select id from student where name=? and age=?";
        String name = student.getName();
        Integer age = student.getAge();
        Integer id = getJdbcTemplate().queryForObject(SQL,new Object[]{name,age},Integer.class);
//        Integer id = getJdbcTemplate().queryForObjec
        return id;
    }
}
