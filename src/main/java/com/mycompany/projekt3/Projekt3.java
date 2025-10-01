package com.mycompany.projekt3;

import java.util.ArrayList;

public class Projekt3 {
    public static void main(String[] args) {
        ArrayList<Person> szemelyek = new ArrayList<>();

        Person p1 = new Person();
        p1.setName("Anna");
        szemelyek.add(p1);

        Employee e2 = new Employee();
        e2.setName("Macska");
        e2.setSalary(4000);
        szemelyek.add(e2);
        Employee e1 = new Employee();
        e1.setName("Bla");
        e1.setSalary(2000);
        szemelyek.add(e1);

        Manager m1 = Manager.getInstance();
        m1.setName("Peter");
        m1.setAge(50);
        m1.setSalary(3500);
        szemelyek.add(m1);

        for (Person p : szemelyek) {
            p.bemutatkozo();
        }

        System.out.println("Osszes szemely szama: " + Person.getPersonCount());
    }
}
