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
        Alex.SubjectList(Class1);
        Alex.SubjectList(Class2);
        Alex.SubjectList(Class3);
        Alex.SubjectList(Class4);
        Alex.Array();
        Alex.Average();


    }
}
