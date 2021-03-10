import java.lang.reflect.Array;

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
    int index = 1;
    Courses[] course;

    public void Array(Courses Subject){
        if(index == 9){
            return;
        }
    course[index] = Subject;
    index++;
    System.out.println(course[index]);
    }
    public String toString(){
        return "Student First name: "+ Firstname + " " + "Student ID: " + IDNum;
    }



}
