package week6_homeworkmitali;
/* 7. Write a program to insert any temperature value in degree Fahrenheit and
      convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/
import java.util.Scanner;
public class TaskSeven {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter degree Fahrenheit: ");
        float Fahrenheit= scanner.nextFloat();
        float Celsius  = ((Fahrenheit-32)*5)/9;
        System.out.println("Fahrenheit to degree celsius is=  " + Celsius);
    }
}
