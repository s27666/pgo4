import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        StudentGroup group1 = new StudentGroup();
        StudentGroup group2 = new StudentGroup();

        student1.fname = "Michael";
        student1.lname = "Jackson";
        student1.indexNumber = 242424;
        student1.email = "s242424@pjwstk.edu.pl";
        student1.address = "Warszawa Wałbrzyska";
        student1.grades = new ArrayList<>();
        student1.grades.add(3.0);
        student1.grades.add(5.0);
        student1.grades.add(3.5);
        student1.grades.add(4.0);
        double average1 = student1.calculateAverage();
        student1.checkGrades();
        group1.addStudentToGroup(student1);





        student2.fname = "Jimmy";
        student2.lname = "Kowalski";
        student2.indexNumber = 242425;
        student2.email = "s242425@pjwstk.edu.pl";
        student2.address = "Warszawa Wierzbno";
        student2.grades = new ArrayList<>();
        student2.grades.add(3.0);
        student2.grades.add(3.0);
        student2.grades.add(3.5);
        student2.grades.add(3.0);
        double average2 = student2.calculateAverage();
        student2.checkGrades();
        group1.addStudentToGroup(student2);



        student3.fname = "Harry";
        student3.lname = "Potter";
        student3.indexNumber = 300001;
        student3.email = "s30001@pjwstk.edu.pl";
        student3.address = "Warszawa Stokłosy";
        student3.grades = new ArrayList<>();
        student3.grades.add(3.0);
        student3.grades.add(5.0);
        student3.grades.add(3.0);
        student3.grades.add(5.0);
        double average3 = student3.calculateAverage();
        student3.checkGrades();
        group2.addStudentToGroup(student3);



        student4.fname = "Miłosz";
        student4.lname = "Jackson";
        student4.indexNumber = 300002;
        student4.email = "s30002@pjwstk.edu.pl";
        student4.address = "Warszawa Imielin";
        student4.grades = new ArrayList<>();
        student4.grades.add(5.0);
        student4.grades.add(5.0);
        student4.grades.add(5.0);
        student4.grades.add(5.0);
        double average4 = student4.calculateAverage();
        student4.checkGrades();
        group1.addStudentToGroup(student4);



    }

}
