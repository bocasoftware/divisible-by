package com.LuisCadena;

public class Main {
//Find  the next 5 numbers divisible by 3 and 5 , print out the sum of these numbers
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int startNumber = 1;

        for (int i = startNumber; i <= 1000; i++) {
            //check if i is divisible by 3 or 5
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);

                sum = sum + i;

                count = count + 1;

                if (count == 5) {
                    System.out.println("The sum of the next 5 numbers divisible by 3 and 5 is equal to " + sum);
                    break;
                }
            }


        }


    }
}
