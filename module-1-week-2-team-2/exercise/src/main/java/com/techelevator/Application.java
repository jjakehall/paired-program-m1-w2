package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    /**
     * The main entry point in the application
     * @param args
     */

    public List<Department> departments = new ArrayList<>();

    Department marketingDept = new Department(1,"Marketing");
    Department salesDept = new Department(2, "Sales");
    Department engineeringDept = new Department(3, "Engineering");


    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the Teams project
        createTeamsProject();
        // create the Marketing Landing Page com.techelevator.Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */


    private void createDepartments() {
        Department marketingDept = new Department(1,"Marketing");
        Department salesDept = new Department(2, "Sales");
        Department engineeringDept = new Department(3, "Engineering");
        departments.add(marketingDept);
        departments.add(salesDept);
        departments.add(engineeringDept);


    }
    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department name : departments) {
            System.out.println(name.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
