/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projekt3;

public class Manager extends Employee {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void bemutatkozo() {
        System.out.println("Nevem: " + getName());
        System.out.println("Korom: " + getAge());
        System.out.println("Fizetesem: " + getSalary() + " euro");
    }
}