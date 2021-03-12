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
    public void AddSubject(Courses Subject){
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
        double Result = 0;
        for( int g = 1; index > g ; g++) {
        Result = Result + courses[index-g].getGrade();
        }
        System.out.println("Average: " +(int) ( Result / (index-1)) + "%");

    }


    public String toString(){
        return "Student First name: "+ Firstname + " " + "Student ID: " + IDNum;
    }



}
