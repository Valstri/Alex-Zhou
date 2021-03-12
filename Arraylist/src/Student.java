public class Student {
    private String Firstname;
    private String Lastname;
    private double Grade;
    private static int ID = 1;
    private int IDNum;

    //Constructor, Unique Student ID
    Student(String FirstName, String Lastname, int Grade){

        this.Firstname = FirstName;
        this.Lastname = Lastname;
        this.Grade = Grade;
        IDNum = ID;
        ID++;
    }


    public String toString(){
        return "||" + "Student name: " + Firstname + " " + Lastname + " Student ID: " + IDNum + " Grade: " + Grade + "||" + "\n";
    }

    //Settler and getter
    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double grade) {
        Grade = grade;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Student.ID = ID;
    }

    public int getIDNum() {
        return IDNum;
    }

    public void setIDNum(int IDNum) {
        this.IDNum = IDNum;
    }
}