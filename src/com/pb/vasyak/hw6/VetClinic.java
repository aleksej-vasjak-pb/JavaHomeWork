package com.pb.vasyak.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("короткая");
        Dog dog = new Dog("с хвостом");
        Horse horse = new Horse(185);

        Animal[] animals = new Animal[]{cat, dog, horse};
        for (Animal a : animals) {
            treatAnimal(a);
        }

        Class clazz = Class.forName("com.pb.vasyak.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor(new Class[]{});
        Object obj = constr.newInstance();



    }

    private static void treatAnimal(Animal a) {
    }
}
