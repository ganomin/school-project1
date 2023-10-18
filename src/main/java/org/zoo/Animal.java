package org.zoo;

public class Animal {
    String specie;
    Long caloriesCounter = 0L;
    Boolean isHungry = true;
    Integer caloriesToFull;

    public Animal(String specie) {
        this.specie = specie;
    }

    public void speak() {
        specie = "dog";
        System.out.println("My name is " + specie);
    }

//    public void feed(String food) {
//        System.out.println(food);
//    }
//
//    public void feed(String food, int amount) {
//        System.out.println(food + amount);
//    }

    public void feed(Food food) {
        System.out.println("Jem sobie: "
                + food.foodType + " która ma " + food.calories + " kalorii.");
        caloriesCounter += food.calories;
        System.out.println("Dziś zjadłem " + caloriesCounter + " kalorii.");
    }
}