package com.atguigu.springboot.bean;

/**
 * @author 刘振东
 * @create 2021-10-07 14:25
 */
public class Dog {

    private  String name;
    private  Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
