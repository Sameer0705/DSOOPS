package com.Sameer.day43;

import java.util.*;
public class practice {
        public  static  void main(String args[]){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter size of cache");
            int size=sc.nextInt();
            String [] cache = new String[size];
            System.out.println("Enter Elemnts: ");
            for(int i=0;i<size;i++){
                cache [i]=sc.next();
            }
            System.out.println(Arrays.toString(cache));
        }
    }