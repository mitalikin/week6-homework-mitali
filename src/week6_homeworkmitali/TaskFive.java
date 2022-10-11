package week6_homeworkmitali;
/*Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.) */
public class TaskFive {
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    public static void main(String[] args) {
        myAddition();
        mySubtraction();
        myMultiplication();
        myDivision();
    }
    public static void myAddition() {
        TaskFive taskFive = new TaskFive();
        String s = (taskFive.a) + (taskFive.b) + c + d + "addition";
        System.out.println(s);
    }
    public static void mySubtraction() {
        TaskFive taskFive = new TaskFive();
        String s = (taskFive.a) + (taskFive.b) - c - d + "subtraction";
        System.out.println(s);

    }
    public static void myMultiplication() {
        TaskFive taskFive = new TaskFive();
        String s = (taskFive.a) * (taskFive.b) * c * d + "multiplication";
        System.out.println(s);

    }
    public static void myDivision() {
        TaskFive taskFive = new TaskFive();
        String s = (taskFive.a) / (taskFive.b) / c / d + "division";
        System.out.println(s);
    }
}


