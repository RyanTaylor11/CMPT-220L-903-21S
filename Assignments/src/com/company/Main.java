package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[]= {10,2,3,40,22,13};
        int h = arr.length;
        int s = 0;
        for (int i=0; i< h; i++){
            for (int y=1;y < (h-i); y++){
                if(arr[y-1]>arr[y]){
                    s = arr[y-1];
                    arr[y-1]=arr[y];
                    arr[y]=s;
                }
            }
        }
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
