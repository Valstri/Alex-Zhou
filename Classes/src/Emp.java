public class Emp {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;



    public Emp(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return (salary * 12);
    }
    public int raiseSalary(int percent){
        return ((int)(salary * (double)(percent/100)));
    }
    public String toString(){
        return "id " + this.id + "\tname: " + getFirstname() + " " + getLastname() + "\tsalary: " + this.salary;
    }
}


