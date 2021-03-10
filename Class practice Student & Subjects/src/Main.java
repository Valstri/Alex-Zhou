import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Courses Class1 = new Courses("English", 80);
        Courses Class2 = new Courses("Math", 85);
        Student Alex = new Student("Alex");
        Student Jef = new Student("Jef");
        System.out.println(Class1);
        System.out.println(Alex);
        System.out.println(Jef);
        Alex.SubjectList(Class1);
        Alex.SubjectList(Class2);

    }
}
