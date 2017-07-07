package com.Malek;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int total = 0;
        int num;
        int avg;
        int counter = 0;

        while (counter < 10) {
            System.out.println("Input a number: ");
            num = sc.nextInt();
            total += num;
            counter++;
        }
        avg = total/10;
        System.out.println("Your average is: " + avg);
    }
}
