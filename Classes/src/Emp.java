public class Emp {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;



    public Emp(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public String getName(){
        return firstname + " " + lastname;
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
    public double raiseSalary(double percent){
        return (salary * (percent/100));
    }
    public String toString(){
        return "id: " + this.id + "\tName: " + getFirstname() + " " + getLastname() + "\tSalary: " + "$" + this.salary;
    }
}


