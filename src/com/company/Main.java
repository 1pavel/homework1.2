package com.company;


public class Main {

    public static void main(String[] args) {
        /*  Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
        записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/
        double m=8.5,n=11.5,a=10, b ,c;
        b=a-m;
        c=a-n;
        if (b<0) b*=-1;
        if (c<0) c*=-1;
        if (b<c) {
            System.out.println(b);
        }else if (c<b) {
            System.out.println(c);
        }else {
            System.out.println("Одинаково приближенный к 10");
        }

    }
}
