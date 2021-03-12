import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Courses Class1 = new Courses("English", 80);
        Courses Class2 = new Courses("Math", 85);
        Courses Class3 = new Courses("Social study", 60);
        Courses Class4 = new Courses("Food", 90);
        Student Alex = new Student("Alex");
        Student Jef = new Student("Jef");
        System.out.println(Alex);
        System.out.println(Jef);
        Alex.AddSubject(Class1);
        Alex.AddSubject(Class2);
        Alex.AddSubject(Class3);
        Alex.AddSubject(Class4);
        Alex.Array();
        Alex.Average();


    }
}
