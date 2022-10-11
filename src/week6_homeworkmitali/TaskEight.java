package week6_homeworkmitali;
/* 8. Write a program to calculate the area of a triangle*/
import java.util.Scanner;
public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter base of triangle =  ");
        double base = scanner.nextDouble();
        System.out.println("please enter height of triangle = ");
        double height = scanner.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Area of Triangle is: " + area);
        //System.Close();
    }
}

