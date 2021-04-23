package sample;

public class Friend {
    private String name;
    private String Age;
    private String Grade;

    Friend(String a, String b, String c){
        name = a;
        Age = b;
        Grade = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
    public String toString(){
        return name;
    }
}
