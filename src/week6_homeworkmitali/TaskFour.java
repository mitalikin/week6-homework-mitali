package week6_homeworkmitali;
/* 4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
    print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme*/
public class TaskFour {

    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    public static void main(String[] args) {
        firstMethod();
        TaskFour obj = new TaskFour();
        obj.secondMethod();

    }
    public static void firstMethod() {
        System.out.println(c);//30
        System.out.println(d);//40
        TaskFour taskFour = new TaskFour();
        System.out.println(taskFour.a);
        System.out.println(taskFour.b);
    }
    public void secondMethod() {
        System.out.println(a);//10
        System.out.println(b);//20
        TaskFour taskFour1 = new TaskFour();
        System.out.println(taskFour1.c);
        System.out.println(taskFour1.d);

    }
}
