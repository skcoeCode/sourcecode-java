package com.java.oop.design.day5;

import java.util.Comparator;

final class SalarySort implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int aa=(int) (o1.getSalary()-o2.getSalary());
        
        return aa;
    }
}