package com.Sameer.random;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
int n = 5;
//        int b = sc.nextInt();
        for (int i = 0 ; i < n; i++) {
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n || j == n){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
//            for(int s = 0;s<= n - i ;s++){
//                System.out.print("_");
//            }
//            for (int j = 1 ; j <= 2 * i  - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
        }
    }
}