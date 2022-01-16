package com.Assem;

import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        int a [] = new int [5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            a [i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
