import java.util.ArrayList;

public class School {

    private Student student;
    private Teacher teacher;





    ArrayList<Student> StudentList = new ArrayList<>();
    ArrayList<Teacher> TeacherList = new ArrayList<>();

    //Add Student and Teacher
    public void AddStudent(Student student){
        StudentList.add(student);

    }
    public void AddTeacher(Teacher teacher){
        TeacherList.add(teacher);
    }

    //Remove method
    public void RemoveStudent(Student student){
        StudentList.remove(student);
    }
    public void RemoveTeacher(Teacher teacher){
        TeacherList.remove(teacher);
    }

    //Display method
    public void ShowAllStudent(){
        System.out.println(StudentList);
    }
    public void ShowAllTeacher(){
        System.out.println(TeacherList);
    }

}

