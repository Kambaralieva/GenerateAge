package com.company;

public class Main {


    public static void main(String args[]) {


            int min = 1;
            int max = 100;

            System.out.println("Можно ли идти гулять");
            int random_int = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(random_int);
        }
    }


