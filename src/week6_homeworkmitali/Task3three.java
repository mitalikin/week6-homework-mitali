package week6_homeworkmitali;
/* 3. Write a Java programme using the following steps.
   3.1 Declare one instance and one static variable.
   3.2 Declare one instance method.
   3.3 Declare one static method.
   3.4 Call both instance and static variables into both instance and static methods inside the
   print statement.
   3.5 Declare the Main method.
   3.6 Call both instance and static methods into the Main method and run the programme*/
public class Task3three {
    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        firstMethod();
        Task3three obj = new Task3three();
        obj.secondMethod();
    }
    public static void firstMethod() {
        System.out.println(b);
        Task3three t = new Task3three();
        System.out.println(t.a);
    }
    void secondMethod() {
        System.out.println(a);
        Task3three t = new Task3three();
        System.out.println(t.b);
    }
}


