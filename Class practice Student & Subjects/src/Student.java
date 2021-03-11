import javafx.beans.binding.When;

import javax.security.auth.Subject;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Student {
    private String Firstname;
    private static int ID = 0;
    private int IDNum;
    int c = 0;
    Student(String Firstname){
        this.Firstname = Firstname;
        IDNum = ID;
        ID ++;
        courses = new Courses[9];
    }
    //Array
    Courses[] courses;
    int index = 1;
    int C = 1;
    public void SubjectList(Courses Subject){
        if(index < courses.length){
            courses[index] = Subject;
            index++;

        }
    }
    public void Array(){
        for(int i = 1; i < 8; i++){
            if(i < index) {
                System.out.println(courses[index - i]);
            }
        }

    }
    public void Average(){
        int Result;
        int g = 0;
        while( (index - g) > 0) {
        Result = Result + courses[index-g].getGrade();
        g++;
        }

    }
    //            double Course1 = courses[index - 1].getGrade();
    //            double Course2 = courses[index - 2].getGrade();
    //            double Course3 = courses[index - 3].getGrade();
    //            double Course4 = courses[index - 4].getGrade();
    //            double Course5 = courses[index - 5].getGrade();
    //            double Course6 = courses[index - 6].getGrade();
    //            double Course7 = courses[index - 7].getGrade();
    //            double Course8 = courses[index].getGrade();


    public String toString(){
        return "Student First name: "+ Firstname + " " + "Student ID: " + IDNum;
    }



}
