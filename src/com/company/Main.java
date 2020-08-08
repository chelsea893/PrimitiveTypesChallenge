package com.company;

public class Main {

    public static void main(String[] args) {
        int integer = 10;
        byte bytevalue = 20;
        short shortvalue = 50;
        long longVariable = 50000L + 10L* (bytevalue + shortvalue + integer); // need to put L for long value
        System.out.println(longVariable);

        short shortTotal = (short) (1000 + 10 * (bytevalue + shortvalue + integer)); //need to cast the value as there is a smaller range
	// write your code here
    }
}
