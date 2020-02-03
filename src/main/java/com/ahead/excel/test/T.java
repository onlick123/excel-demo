package com.ahead.excel.test;

import ch.qos.logback.core.net.SyslogOutputStream;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/31 10:58
 */
class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }
    public Person(){}
    public void setName(String name) {
        this.name = name;
    }
}
class Student extends  Person{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name) {
        super(name);
    }
    public Student(int age){

        setAge(age);
    }
}
public class T {
      public static void main(String[] args) {
//        Student d=new Student("sada");
//          System.out.println(d.toString());
          System.out.println(19%3);
    }


}
