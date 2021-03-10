public class Courses {
    private String Subject;
    private double Grade;

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double grade) {
        Grade = grade;
    }

    Courses(String Subject, double Grade){
        this.Subject = Subject;
        this.Grade = Grade;
    }

    public String toString(){
        return "Subject: " + Subject + " Grade: " + Grade;
    }

}
