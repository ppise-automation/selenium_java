package org.example.coding;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String a = "I am java Programmer, am I ?";

        String [] b = a.split(" ");

        HashMap<String,Integer> hm = new HashMap<>();

        for(String f : b){
            if(hm.containsKey(f)){
                hm.put(f,hm.get(f)+1);
            }
            else{
                hm.put(f,1);
            }
        }
        System.out.println(hm);

        for(Map.Entry<String,Integer> gg: hm.entrySet()){
            if(gg.getValue()>1){
                System.out.print(gg.getKey()+" "+ gg.getValue());
            }
        }
    }
}
