package com.divyansh;

import java.util.Scanner;

public class basiccondition {

    public static void main(String[] args) {
        /*
        syntax for if condition
         */

        int a = 2;

        if (a==2){
            System.out.println("hello world");
        }

        /*
        nested if condition
         */

        int salary = 25000;
        if (salary >= 10000) {
            salary += 2000;

        }
        else if (salary >=1000) {
            salary += 1000;
        }

        if (salary <1000){
            salary += 300;

        }
        System.out.println(salary);
    }
}
