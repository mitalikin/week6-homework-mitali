package week6_homeworkmitali;
/*17. Write a Java program to convert a decimal number to binary number.
      Input Data:
      Input a Decimal Number : 5
      Expected Output:
      Binary number is 101 */
import java.util.Scanner;

public class TaskSeventeen {
    int i = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input decimal number: ");
        int decimal = sc.nextInt();
        System.out.println(Integer.toBinaryString(5));
    }
}
