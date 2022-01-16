package com.Assem;

import java.util.Scanner;

public class j4 {
    public static int a [] = new int [5];
    public static void input() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
        }
    }
    public static void output() {
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {

    }
}
