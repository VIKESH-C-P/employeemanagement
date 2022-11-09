package com.demo.variables;

import java.util.*;
import java.io.*;
import java.math.*;
public class Prob1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int num=sc.nextInt();
        double squ=Math.sqrt(num);
        double poss=squ*squ;
        System.out.println(poss);
    }
}