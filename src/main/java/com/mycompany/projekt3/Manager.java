package com.mycompany.projekt3;

public class Manager extends Employee {
    private int age;
    private static Manager instance;

    private Manager() {}

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void bemutatkozo() {
        super.bemutatkozo();
        System.out.println("Korom: " + getAge());
    }
}
