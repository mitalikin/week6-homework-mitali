package week6_homeworkmitali;
/*Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.) */
public class Task5five {
     int a= 40;
     int b= 20;


    public static void main(String[] args) {
        myAddition();//60
        mySubtraction();//20
        Task5five obj= new Task5five();
        obj.myMultiplication();//800
        obj.myDivision();//2
    }
    public static void myAddition() {
        Task5five t= new Task5five();
        String s = (t.a) + (t.b) + " addition";
        System.out.println(s);
        mySubtraction();//20
    }
    public static void mySubtraction() {
        Task5five t= new Task5five();
        String s = (t.a) - (t.b) + " subtraction";
        System.out.println(s);//20
        t.myMultiplication();//800
    }
    public void myMultiplication() {
        String s = (a)*(b) + " multiplication";
        System.out.println(s);//800
        myDivision();
    }
    public void myDivision() {
        String s = (a)/(b) + " division";
        System.out.println(s);



    }
}
