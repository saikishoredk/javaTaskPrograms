import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Name: ");
            scanner.nextLine(); // consume newline character
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(name, age, salary);
            employees.add(employee);
        }

        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }
}

/*This code is an Employee Management System implemented in Java. It allows users to input information about multiple employees, such as their name, age, and salary, and then displays the details of each employee.

The code uses an ArrayList to store instances of the Employee class. It prompts the user to enter the number of employees and then collects information for each employee using a loop.

Inside the loop, the program asks for the employee's name, age, and salary, and creates a new Employee object with the provided information. The newly created employee object is added to the employees list.

After all the employees have been added, the program displays the details of each employee by iterating over the employees list. It prints the name, age, and salary of each employee.

Overall, this code provides a basic employee management system that allows users to input and view employee details.*/
