package week6_homeworkmitali;
/* 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
       remainder of two numbers.
       Test Data:
       Input first number: 125
       Input second number: 24
       Expected Output :
                 125 + 24 = 149
                 125 - 24 = 101
                  125 x 24 = 3000
                   125 / 24 = 5
                  125 mod 24 = 5*/
import java.util.Scanner;

public class TaskEighteen {
    int a=125;
    int b=24;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int number1 = input.nextInt();
        System.out.println("Input second number");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println(number1+ "+" +number2+ " = " +sum);
        int subtraction = number1 - number2;
        System.out.println(number1+ "-" +number2+"= "+subtraction);
        int multiplication = number1 * number2;
        System.out.println(number1+ "*" +number2+"= " + multiplication);
        int division = number1 / number2;
        System.out.println(number1+" / "+number2+"= " + division);
        int mod = number1 % number2;
        System.out.println(number1+" mod "+number2+ " ="+ mod);
    }
}
