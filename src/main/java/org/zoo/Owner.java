package org.zoo;

public class Owner {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.speak();
//        dog.feed("jedzenie");
//        dog.feed("jedzenie", 2);
        Food parowka = new Food("parówka", 50000L);
        dog.feed(parowka);

    }
}