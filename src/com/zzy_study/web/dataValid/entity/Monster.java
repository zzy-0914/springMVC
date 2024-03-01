package com.zzy_study.web.dataValid.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class Monster {
    private String age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String birthday ;
    @NumberFormat(pattern = "###,###.##")
    private String email ;
    private String name;
    private String salary;

    public Monster() {
    }

    public Monster(String age, String birthday, String email, String name, String salary) {
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.name = name;
        this.salary = salary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "age='" + age + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
