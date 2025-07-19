package org.example.coding;

public class AllZerosToEnd {
    public static void main(String[] args) {

        int [] b = {1,0,2,0,3,0,4};

        int n = b.length;

        int [] temp = new int[n];
        int j = 0;

        for(int i=0; i<n;i++){
            if(b[i]!=0){
                temp[j++] = b[i];
            }
        }

        while(j<n){
            temp[j++]=0;
        }

        for(int k=0; k<n;k++){
            System.out.print(temp[k]);
            System.out.print("\t");
        }
    }
}
