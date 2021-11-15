package com.pb.vasyak.hw7;

public class Tie extends Clothes implements ManClothes, WomenClothes {

    public Tie(Size size, double price, String color) {
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
        return "Галстук: " + "размер: " + getSize() + "цена: " + getPrice() + "Грн." + "цвет: " + getColor() + ".";
    }
}
