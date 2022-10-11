package week6_homeworkmitali;

import sun.plugin2.message.JavaReplyMessage;

import java.util.Scanner;
/* 13. Write a Java program that takes three numbers as input to calculate and
       print the average of the numbers.*/
public class TaskThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num3 = scanner.nextInt();
        scanner.close();
        System.out.print("The average of entered numbers is: " + (num1 + num2 + num3) / 3);
    }
}



