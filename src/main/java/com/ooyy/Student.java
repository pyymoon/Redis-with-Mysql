package com.ooyy;

public class Student {
    private Integer id;
    private Integer age;
    private String name;

    private String addr;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getAddr() {
        return addr;
    }
}
