package com.driver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        RWOnly r = new RWOnly();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        r.setter(name);
        System.out.println(r.getter());
    }
}