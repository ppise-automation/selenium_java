package org.example.coding;

import java.lang.module.FindException;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int []  a ={11,2,34,55,6,77,32,11};

        SecondLargest sl = new SecondLargest();

        int num = sl.FindSecondHighest(a);
        System.out.println(num);

    }

    public int FindSecondHighest(int [] a){
        int n = a.length;

        Arrays.sort(a);

        for(int i=n-2;i>=0;i--){
            if(a[i]!=a[n-1]){
                return a[i];
            }
        }

        return -1;
    }
}
