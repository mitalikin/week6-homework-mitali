package week6_homeworkmitali;
/* 19. Write a Java program to convert a given string into lowercase.
       Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        utput: the quick brown fox jumps over the lazy dog*/
import java.util.Scanner;

public class TaskNineteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sentence is: ");
        String line = scanner.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
       //System .close();
    }
}
