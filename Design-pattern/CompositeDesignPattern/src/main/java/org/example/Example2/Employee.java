package org.example.Example2;
//package org.example.composite;

import java.util.ArrayList;
import java.util.List;

// Component interface
interface Employee
{
    void showDetails();
}

// Leaf class
class Developer implements Employee
{
    private String name;
    private String role;

    public Developer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer: " + name + ", Role: " + role);
    }
}

// Leaf class
class Manager implements Employee {
    private String name;
    private String role;

    public Manager(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + ", Role: " + role);
    }
}

// Composite class
class Department implements Employee {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }


// Client code
    public static void main(String[] args) {
        // Creating individual employees
        Developer dev1 = new Developer("Alice", "Frontend Developer");
        Developer dev2 = new Developer("Bob", "Backend Developer");
        Manager manager1 = new Manager("Charlie", "Team Manager");

        // Creating a department and adding employees
        Department devDepartment = new Department("Development");
        devDepartment.addEmployee(dev1);
        devDepartment.addEmployee(dev2);
        devDepartment.addEmployee(manager1);

        // Creating another department
        Manager manager2 = new Manager("Eve", "HR Manager");
        Department hrDepartment = new Department("HR");
        hrDepartment.addEmployee(manager2);

        // Showing details of each department
        System.out.println("Company Structure:");
        devDepartment.showDetails();
        System.out.println();
        hrDepartment.showDetails();
    }
}

