import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Grade Management System ---");
            System.out.println("1. Add a Student");
            System.out.println("2. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Marks: ");
                double marks = scanner.nextDouble();
                
                studentList.add(new Student(id, name, marks));
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                System.out.println("\n--- Student List ---");
                if (studentList.isEmpty()) {
                    System.out.println("No records found.");
                } else {
                    for (Student s : studentList) {
                        s.displayStudent();
                    }
                }
            }
        } while (choice != 5);
    }
}