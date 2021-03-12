public class Teacher {
    private String Firstname;
    private String Lastname;
    private String Subject;

    //Constructor
    Teacher(String Firstname, String Lastname, String Subject){
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Subject = Subject;
    }
    public String toString(){
        return  "||" + "Teacher name: " + Firstname + " " + Lastname  + " Subject: " + Subject + "||" + "\n";
    }


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

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
