import java.util.Scanner;

class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Name: ");
            scanner.nextLine(); // consume newline character
            String name = scanner.nextLine();
            System.out.print("Number of grades: ");
            int numGrades = scanner.nextInt();

            int[] grades = new int[numGrades];
            for (int j = 0; j < numGrades; j++) {
                System.out.print("Grade " + (j + 1) + ": ");
                grades[j] = scanner.nextInt();
            }

            students[i] = new Student(name, grades);
        }

        System.out.println("Student Grades and Averages:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.print("Grades: ");
            for (int grade : student.getGrades()) {
                System.out.print(grade + " ");
            }
            System.out.println();
            System.out.println("Average Grade: " + student.calculateAverageGrade());
            System.out.println();
        }
    }
}

//The provided Java code represents a Student Grade Calculator application. Users are prompted to enter the number //of students, their names, and their corresponding grades. The application then calculates and displays the //average grade for each student. The program uses a Student class to encapsulate student information, including //name and grades, and provides methods to retrieve the data and calculate the average grade. The //StudentGradeCalculator class handles the program flow, allowing users to input student details and displaying //the results. This simple and intuitive application facilitates the management and assessment of student grades, //providing valuable insights into their academic performance.




