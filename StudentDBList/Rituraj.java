/*Write a program to create a student database following conditions needed to be taken care of:
1. You will consider two user one teacher and other is the student the work of teacher is to add and update the student database.
The work of a student is simply to access his/her own database only.Database includes student Id ,student name, age,gender, branch and marks.
student Id must be unique.
2. If student try to access any other student database a message will be displayed "you are not authorised to access database".
3.To access his/her database student have to enter the Id and a password that includes first 4 letter of the first name and the dob
in the following format "ritu2110".*/
// Author: -Rituraj Gupta
import java.util.Scanner;
import java.util.TreeMap;

class Student {
    private String id;
    private String name;
    private String dob;
    private int age;
    private char gender;
    private String branch;
    private double marks;

    public Student(String id, String name, String dob, int age, char gender, String branch, double marks) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.branch = branch;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return dob;
    }

    public String getFirstName() {
        if (name.contains(" "))
            return name.split(" ")[0];
        else
            return name;
    }

    public void Name(String n) {
        this.name = n;
    }

    public void Dob(String dob) {
        this.dob = dob;
    }

    public void Age(int a) {
        this.age = a;
    }

    public void branch(String bra) {
        this.branch = bra;
    }

    public void marks(double mar) {
        this.marks = mar;
    }

    public String toString() {
        String s = "Id:\t" + id + "\nName:\t" + name + "\nAge:\t" + age + "\nGender:\t" + gender + "\nBranch:\t"
                + branch + "\nMarks:\t" + marks;
        return s;
    }
}

public class Rituraj {
    private static TreeMap<String, Student> Tm = new TreeMap<String, Student>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exit = 0;
        do {
            System.out.println("Welcome! to Student database management system");
            System.out.println("Is this admin?(Y/N)");
            boolean isAdmin = sc.nextLine().toUpperCase().charAt(0) == 'Y';
            if (isAdmin)
                admin(sc);
            else
                student(sc);
            System.out.println("1 to continue 0 to exit");
            exit = sc.nextInt();
            sc.nextLine();
        } while (exit != 0);
        sc.close();
    }

    private static void admin(Scanner sc) {
        do {
            System.out.println(
                    "Admin Menu\n1. Add a Student\n2. Remove a Student\n3. Update a Student\n4. View an Student\n0. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Thank You");
                    return;
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    removeStudent(sc);
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    System.out.print("Enter Student id ");
                    sc.nextLine();
                    String id = sc.nextLine();
                    if (Tm.containsKey(id))
                        System.out.println("Student Detail:\n" + Tm.get(id).toString());
                    else
                        System.out.println("No Student Exist");
                    break;

                default:
                    break;
            }
        } while (true);
    }

    private static void addStudent(Scanner sc) {
        System.out.println("Enter Student to add");
        System.out.print("Id ");
        sc.nextLine();
        String id = sc.nextLine();
        if (Tm.containsKey(id)) {
            System.out.println("Student id already present");
            return;
        }

        System.out.print("Name ");
        String name = sc.nextLine();

        System.out.print("ddmmyy ");
        String dob = sc.nextLine();

        System.out.print("Age ");
        int age = sc.nextInt();

        System.out.print("Gender(M/F) ");
        sc.nextLine();
        char g = sc.nextLine().toUpperCase().charAt(0);

        System.out.print("Branch ");
        String bra = sc.nextLine();

        System.out.print("Marks ");
        double mark = sc.nextDouble();

        Student s = new Student(id, name, dob, age, g, bra, mark);
        Tm.put(id, s);
    }

    private static void removeStudent(Scanner sc) {
        System.out.println("Enter an id to remove ");
        sc.nextLine();
        String id = sc.nextLine();
        if (Tm.containsKey(id))
            Tm.remove(id);
        else
            System.out.println("No Student exist");
    }

    private static void updateStudent(Scanner sc) {
        System.out.println("Enter id to update ");
        sc.nextLine();
        String id = sc.nextLine();
        if (Tm.containsKey(id)) {
            System.out.println("What do you want to update?\n1.Name\n2.Age\n3.Date of Birth\n4.bBranch\n5.Marks");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter new Name ");
                    String name = sc.nextLine();
                    Tm.get(id).Name(name);
                    break;

                case 2:
                    System.out.println("Enter new Age ");
                    int age = sc.nextInt();
                    Tm.get(id).Age(age);
                    break;
                case 3:
                    System.out.println("ddmmyy ");
                    String dob = sc.nextLine();
                    Tm.get(id).Dob(dob);
                    break;
                case 4:
                    System.out.println("Enter new branch ");
                    String bra = sc.nextLine();
                    Tm.get(id).branch(bra);
                    break;
                case 5:
                    System.out.println("Enter new marks ");
                    double mar = sc.nextDouble();
                    Tm.get(id).marks(mar);
                    break;

                default:
                    break;
            }
        } else
            System.out.println("No Student exist");
    }

    private static void student(Scanner sc) {
        System.out.print("Enter your id: ");
        String id = sc.nextLine();
        if (!Tm.containsKey(id)) {
            System.err.println("No Student id exist");
            return;
        }
        System.out.print("Enter your password(nameDOB): ");
        String pass = sc.nextLine();
        String dbpassowrd = Tm.get(id).getFirstName().toLowerCase().substring(0, 4) + ""
                + Tm.get(id).getDOB().substring(0, 4);
        System.out.println(dbpassowrd);
        if (dbpassowrd.compareTo(pass) == 0) {
            System.out.println("Student Details:\n" + Tm.get(id).toString());
        } else
            System.err.println("Incorrect Password");

    }
}