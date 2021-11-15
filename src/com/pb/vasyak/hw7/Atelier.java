package com.pb.vasyak.hw7;

public class Atelier {
    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt(Size.XS, 50, "синяя");
        Pants pants = new Pants(Size.S, 150, "черные");
        Skirt skirt = new Skirt(Size.M, 100, "красная");
        Tie tie = new Tie(Size.L, 180, "коричневый");

        Clothes[] clothes = new Clothes[]{tshirt, pants, skirt, tie};
        dressMan(clothes);
        dressWomen(clothes);

    }

    private static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }

    private static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда: ");
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }
}
