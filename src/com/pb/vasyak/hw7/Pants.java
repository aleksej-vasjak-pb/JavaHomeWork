package com.pb.vasyak.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    public Pants(Size size, double price, String color) {
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
        return "Штаны: " + "размер: " + getSize() + "цена: " + getPrice() + "Грн." + "цвет: " + getColor() + ".";
    }
}
