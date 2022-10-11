package week6_homeworkmitali;

import java.awt.geom.Area;
import java.util.Scanner;
/*  14. Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.6 Height = 8.5
        Expected Output:
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20*/
public class TaskFourteen {
    public static void main(String[] args){
       //double width = 5.6;
      // double height = 8.5;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter Width: ");
       double Width=scanner.nextDouble();
       System.out.println("Enter Height: ");
       double Height=scanner.nextDouble();
       double Area = Width * Height;
       System.out.printf("Area of Rectangle: %.2f\n",  + Area);
       double Perimeter = 2*(Height + Width);
       System.out.println("perimeter of Rectangle: "+ Perimeter);

    }
}

