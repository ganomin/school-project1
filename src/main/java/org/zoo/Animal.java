package org.zoo;

public class Animal {
    String spec;
    char gender;
    int age;
    boolean alive;
    long looong;
    float aFloat;
    double aDouble;

    public void speak() {
        spec = "dog";
        System.out.println("My name is " + spec);
    }

    public void feed(String food) {
        System.out.println(food);
    }

    public void feed(String food, int amount) {
        System.out.println(food + amount);
    }
}