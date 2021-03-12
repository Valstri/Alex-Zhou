public class Main {
    public static void main(String[] args) {
    Student Alex = new Student("Alex", "Zhou", 100);
    Student B = new Student("B", "B", 99);
        Student C = new Student("C", "C", 98);
        Student D = new Student("D", "D", 97);
        Student E = new Student("E", "E", 96);
        Student F = new Student("F", "F", 95);
        Student G = new Student("G", "G", 94);
        Student H = new Student("H", "H", 93);
        Student I = new Student("I", "I", 92);
        Student J = new Student("J", "J", 91);
        Student K = new Student("K", "K", 90);
        Teacher Z = new Teacher("Z","Z", "Math");
        Teacher Y = new Teacher("Y","Y", "SS");
        Teacher X = new Teacher("X","X", "EN");
        School school = new School();

        //Add 10 Students (I don't know if I should use loops to add or not)
        school.AddStudent(Alex);
        school.AddStudent(B);
        school.AddStudent(C);
        school.AddStudent(D);
        school.AddStudent(E);
        school.AddStudent(F);
        school.AddStudent(G);
        school.AddStudent(H);
        school.AddStudent(I);
        school.AddStudent(J);
        school.AddStudent(K);
        school.AddTeacher(Z);
        school.AddTeacher(Y);
        school.AddTeacher(X);

        //Show All students and teachers
        school.ShowAllStudent();
        school.ShowAllTeacher();

        //Remove 2 students
        school.RemoveStudent(Alex);
        school.RemoveStudent(H);

        //Remove 1 teacher
        school.RemoveTeacher(Y);

        //Show all students and teachers again
        school.ShowAllStudent();
        school.ShowAllTeacher();
    }
}
