package com.pb.vasyak.hw6;

public class Animal {

    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное издает шум");
    }

    public void eat() {
        System.out.println("Животное кушает");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}