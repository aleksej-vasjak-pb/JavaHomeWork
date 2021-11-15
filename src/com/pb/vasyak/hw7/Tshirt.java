package com.pb.vasyak.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt(Size size, double price, String color) {
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
        return "Футболка: " + "размер: " + getSize() + "цена: " + getPrice() + "Грн." + "цвет: " + getColor() + ".";
    }
}
