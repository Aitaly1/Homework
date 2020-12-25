package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        double[] array = {7.7,-6.6,-4.4,-3.3,-2.2,1.1,2.2,-1.1,3.3,4.4,5.5,-5.5,6.6,8.8};
        double sum = 0;
        int counter = 0;
        for (double e : array) {
            if (e>0) {
                sum =sum + e;
                counter++;
            }
        }
        System.out.println("" + sum/counter);
    }

}
