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
            System.out.println("3. Search for a Student by ID");
            System.out.println("4. Calculate and Display Average Mark");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    studentList.add(new Student(id, name, marks));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.println("\n--- Student List ---");
                    if (studentList.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (Student s : studentList) {
                            s.displayStudent();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    boolean found = false;
                    for (Student s : studentList) {
                        if (s.getStudentId().equalsIgnoreCase(searchId)) {
                            System.out.println("Student Found:");
                            s.displayStudent();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Student not found!");
                    break;
                case 4:
                    if (studentList.isEmpty()) {
                        System.out.println("No students to calculate average.");
                    } else {
                        double total = 0;
                        for (Student s : studentList) {
                            total += s.getMarks();
                        }
                        System.out.println("Average Mark: " + (total / studentList.size()));
                    }
                    break;
            }
        } while (choice != 5);
    }
}