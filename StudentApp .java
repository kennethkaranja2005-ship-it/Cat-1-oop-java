Class: StudentApp

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");

        String studentID = input.nextLine();

        System.out.print("Enter Name: ");

        String name = input.nextLine();

        System.out.print("Enter Course: ");

        String course = input.nextLine();

        StudentRecord student1 = new StudentRecord(studentID, name, course);

        System.out.println("\nStudent Details:");

        student1.displayInfo();

        input.close();
    }
}