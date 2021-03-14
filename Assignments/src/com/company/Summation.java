package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Summation {
    public static void main(String args[]){
        System.out.println("Enter the required size of the array: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int allnums[] = new int [num];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one: ");

        for(int i=0; i<num; i++){
            allnums[i] = s.nextInt();
            sum = sum + allnums[i];
        }
        System.out.println("Elements of the array are: "+Arrays.toString(allnums));
        System.out.println("Sum of the elements of the array: "+sum);
    }
}

