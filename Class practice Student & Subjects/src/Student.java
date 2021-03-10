import javax.security.auth.Subject;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Student {
    private String Firstname;
    private static int ID = 0;
    private int IDNum;
    Student(String Firstname){
        this.Firstname = Firstname;
        IDNum = ID;
        ID ++;
    }
    //Array
    void SubjectList(Courses Subject){
        ArrayList<Courses> ArraySubject = new ArrayList<>();
        ArraySubject.add(Subject);
        System.out.println(Firstname + "\n" + ArraySubject);
    }
    public String toString(){
        return "Student First name: "+ Firstname + " " + "Student ID: " + IDNum;
    }



}
