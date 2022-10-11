package week6_homeworkmitali;
/* 9. Write a program to convert the upper case to lower case*/
import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;


public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lowStr;

        System.out.print("\nPlease Enter Lowercase String =  ");
        lowStr = scanner.nextLine();

        String lowStr2 = lowStr.toUpperCase();
        System.out.println("\nThe Uppercase String is  =  " + lowStr2);
    }
}

