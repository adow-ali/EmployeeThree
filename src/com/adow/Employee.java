package com.adow;


import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends EmployeeReport {
    Scanner input = new Scanner(System.in);
    ArrayList<Employee> empList = new ArrayList<>();

    // Creating instance  variables
    private int id;
    private String name;
    private double salary;
    private int count = 0;

    // Default/empty constructor
    public Employee() {
    }

    // Constructor with parameters
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    // The method to prompt the user to enter id, name, salary for 3 employees
    public void inputEmpData() {

        while (count < 3) {

            System.out.println("Enter id: ");
            id = input.nextInt();
            System.out.println("Enter name: ");
            name = input.next();
            System.out.println("Enter salary: ");
            salary = input.nextDouble();

            Employee emp = new Employee(id, name, salary);
            empList.add(emp);
            count++;
        }
    }

    // The method to loop thr' the arraylist to display each employee entry
    public void showEmpData() {
        for (Employee em : empList) ;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

    // Method override
    @Override
    public void displayEmpData() {
        System.out.println("Deleting Employee Record");
    }

    @Override
    public void displayHeading() {
        System.out.println("ADC Engineering");
    }

    public void renoveEmployee() {

    }
}
















