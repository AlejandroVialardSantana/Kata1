package com.mycompany.kata_1_v20220915;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Kata_1_v20220915 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2002, 9, 24);
        
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
    }
}
