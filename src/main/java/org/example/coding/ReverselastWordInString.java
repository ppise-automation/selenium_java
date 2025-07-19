package org.example.coding;

public class ReverselastWordInString {
    public static void main(String[] args) {
        String a  = "My name is Parth";

        String [] b= a.split(" ");

        b[b.length-1] = new StringBuilder(b[b.length-1]).reverse().toString();

        String d = String.join(" ",b);
        System.out.println(d);
    }
}
