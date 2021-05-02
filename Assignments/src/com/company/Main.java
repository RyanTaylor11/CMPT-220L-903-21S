package com.company;

public class Main {


            public static void main(String args[]) {
                System.out.println(linear(10));
                System.out.println(Tailend(10));
                System.out.println(head(10));
            }
            public static int linear(int a) {
                if (a == 1) {
                    return 1;
                }
                if (a == 2) {
                    return 1;
                }
                return linear(a - 1) + linear(a - 2);
            }
            public static int Tailend(int b){
                if (b <= 1) {
                     return  1;
                }
                if (b==2){
                    return 1;
                }
                    return Tailend(b-1) + Tailend(b-2);
        }
            public static int head(int number){
                if (number <= 1) {
                    return 1;
                } if (number == 2) {
                    return 1;
                }
                return head(number-1)+head(number-2);
        }
    }
















