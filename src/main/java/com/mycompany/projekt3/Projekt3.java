package com.mycompany.projekt3;

public class Projekt3 {
    public static void main(String[] args) {
        Person[] szemelyek = new Person[3];

        szemelyek[0] = new Person();
        szemelyek[0].setName("Gizi");

        szemelyek[1] = new Employee();
        szemelyek[1].setName("Gyuszi");
        ((Employee)szemelyek[1]).setSalary(2000); 

        szemelyek[2] = new Manager();
        szemelyek[2].setName("Gergo");
        ((Manager)szemelyek[2]).setSalary(3500);
        ((Manager)szemelyek[2]).setAge(50);

        for (Person p : szemelyek) {
            p.bemutatkozo();
        }
    }
}