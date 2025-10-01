package com.mycompany.projekt3;

public class Person {
    private String name;
    private static int personCount = 0;

    public Person() {
        personCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public void bemutatkozo() {
        System.out.println("Nevem: " + getName());
    }
}
