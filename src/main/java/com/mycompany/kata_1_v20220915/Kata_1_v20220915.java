package com.mycompany.kata_1_v20220915;

import java.time.LocalDate;

public class Kata_1_v20220915 {

    public static void main(String[] args) {     
        Person person = new Person("Alejandro", LocalDate.of(2002, 3, 8));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
