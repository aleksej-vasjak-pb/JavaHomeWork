package com.pb.vasyak.hw6;

import java.util.Objects;
import static java.lang.Object.*;
import static java.util.Objects.hash;

public class Horse extends Animal {

    private String height;

    public Horse(String height){
        super("траву", "конюшня");
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String tail) {
        this.height = height;
    }

    @Override
    public void makeNoise(){
        System.out.println("лошать фыркает");
    }

    @Override
    public void eat(){
        System.out.println("лошадь кушает" + getFood());
    }

    @Override
    public void sleep(){
        System.out.println(getLocation() + " спит лошадь");
    }

    @Override
    public String toString(){
        return "рост" + height + " eда" + getFood() + "находится " + getLocation();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Horse horse = (Horse) obj;
        return height == horse.height;
    }

    @Override
    public int hashCode(){
        return hash(height);
    }
}
