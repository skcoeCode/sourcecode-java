package com.java.oop.design.day5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {

    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return String.format("Employee [id=%s, name=%s, salary=%s]", id, name, salary);
    }

   
}

public class DemoCompare{
    public static void main(String[] args) {
        List<Employee>  employeeList =new ArrayList<>();
        employeeList.add(new Employee(1, "A", 300));
        employeeList.add(new Employee(2, "Z", 100));
        employeeList.add(new Employee(3, "x", 200));
        
        employeeList.forEach(System.out::println);
        System.out.println();
        Comparator<Employee> comparator1=(o1, o2) -> (int) (o1.getSalary()-o2.getSalary());
        /*Comparator<Employee> comparator1=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        };*/
        employeeList.sort(comparator1);
        employeeList.forEach(System.out::println);
    }
}