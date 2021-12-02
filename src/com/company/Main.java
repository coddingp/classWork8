package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    static void CheckNumber(int number) {
        if (number >= 0) {
            System.out.println("blablabla");
        } else System.out.println("albalbalb");
    }


    static void newArray(int[] array, int num) {
        for(){

        }
    }

    public static void main(String[] args) {
        Random rnd=new Random();
        int rnd1= rnd.nextInt((100-1)+1)+1;
        System.out.println("Enter number");
        Scanner scn = new Scanner(System.in);
        int scn1 = scn.nextInt();
        CheckNumber(scn1);
    }
}
