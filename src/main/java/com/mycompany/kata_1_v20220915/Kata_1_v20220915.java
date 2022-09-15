package com.mycompany.kata_1_v20220915;

import java.util.Date;

public class Kata_1_v20220915 {

    public static void main(String[] args) {
        Person person = new Person("Zacarias", new Date(102, 9, 25));
        
        System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
    }
}
