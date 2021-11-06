package com.pb.vasyak.hw6;

public class Cat extends Animal {

    private String wool;


    public Cat(String wool){
        super("рыбку", "у окна");
        this.wool = wool;
    }

    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    @Override
    public void makeNoise(){
        System.out.println("Кошка муркает");
    }

    @Override
    public void eat(){
        System.out.println("кошка кушает" + getFood());
    }

    @Override
    public void sleep(){
        System.out.println(getLocation() + " спит кошка");
    }

    @Override
    public String toString(){
        return "шерсть" + wool + "eда" + getFood() + "находится " + getLocation();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
//        boolean equals = Object == wool;
        return Objects.equals(wool, cat.wool);
    }

    @Override
    public int hashCode() {
        return Object.hash(wool);
    }
}
