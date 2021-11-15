package com.pb.vasyak.hw7;

public class Skirt extends Clothes implements ManClothes, WomenClothes {

    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
    }

    @Override
    public void dressWomen() {
    }

    @Override
    public String toString() {
        return "Юбка: " + "размер: " + getSize() + "цена: " + getPrice() + "Грн." + "цвет: " + getColor() + ".";
    }
}
