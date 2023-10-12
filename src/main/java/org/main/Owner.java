package org.main;

public class Owner {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.speak();
        dog.feed("jedzenie");
        dog.feed("jedzenie", 2);
    }
}