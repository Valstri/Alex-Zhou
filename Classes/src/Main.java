public class Main {
    public static void main(String[] args) {
        Emp Juri = new Emp(2, "Juri", "Wong", 10 );
        System.out.println("id: " + Juri.getId());
        System.out.println("First name: " + Juri.getFirstname());
        System.out.println("Last name: " + Juri.getLastname());
        System.out.println("Salary: " + "$" +Juri.getSalary());
        System.out.println(Juri);
        System.out.println("Annual Salary: "+Juri.getAnnualSalary());
        System.out.println("Raise Salary: " + Juri.raiseSalary(10));
    }
}
