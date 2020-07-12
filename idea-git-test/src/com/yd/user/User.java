package com.yd.user;

/**
 * @author jay
 * @date 2020/7/12
 **/
public class User {
    private int age ;
    private  String  name;
    private  String  sex;

    public User() {
    }

    public User(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        System.out.println("idea 测试远程仓库的提交功能");
        System.out.println("第二次测试远程仓库的提交功能");
    }
    
     public static void test() {
        System.out.println("在远程修改了功能");
    }
}
