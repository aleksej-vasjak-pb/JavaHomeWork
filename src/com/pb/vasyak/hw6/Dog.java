package com.pb.vasyak.hw6;

public class Dog extends Animal {

    private String tail;

    public Dog(String tail){
        super("мясо", "во дворе");
        this.tail = tail;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    public void makeNoise(){
        System.out.println("собака гавкает");
    }

    @Override
    public void eat(){
        System.out.println("собака кушает" + getFood());
    }

    @Override
    public void sleep(){
        System.out.println(getLocation() + " спит собака");
    }

    @Override
    public String toString(){
        return "есть" + tail + "eда" + getFood() + "находится " + getLocation();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog dog = (Dog) obj;
        return Object.equals(tail, dog.tail);
    }

    @Override
    public int hashCode(){
        return Object.hash(tail);
    }
}
