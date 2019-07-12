package com.nowcoder;

public class Animal implements Talking {
    public String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println(name + " Animal Say");
    }

}
