package week6_homeworkmitali;
/* 6. Write a program to enter any radius value of the circle and find out the
      area.(Formula of Area A=PI*r*r).*/
import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
        //System.close();


    }


}
