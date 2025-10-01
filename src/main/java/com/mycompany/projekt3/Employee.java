package com.mycompany.projekt3;

public class Employee extends Person {
    private int salary;
    public static final int MINIMUM_WAGE = 1500;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < MINIMUM_WAGE) {
            this.salary = MINIMUM_WAGE;
        } else {
            this.salary = salary;
        }
    }

    @Override
    public void bemutatkozo() {
        super.bemutatkozo();
        System.out.println("Fizetesem: " + getSalary() + " euro");
    }
}
