package week6_homeworkmitali;

import java.util.Scanner;
/* 16. Write a Java program to add two binary numbers.
       Input Data:Input first binary number: 10
                  Input second binary number: 11
                  Expected Output:
                  Sum of two binary numbers: 101*/
public class TaskSixteen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        String b1 = sc.nextLine();
        System.out.println("Input second binary number: ");
        String b2 = sc.nextLine();
        int num1 = Integer.parseInt(b1, 2);
        int num2 = Integer.parseInt(b2, 2);
        int output = num1 + num2;
        System.out.print("\nThe Sum of two binary number is ");
        System.out.print(Integer.toBinaryString(output));
    }
}
