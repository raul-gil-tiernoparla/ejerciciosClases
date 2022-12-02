package com.tiernoparla.clases;

public class Empleado {

    // attr
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constr
    public Empleado(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    } // Empleado


    // meths
    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getSalary() {
        return this.salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Empleado [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
                + "]";
    }



    
    

} // Empleado
