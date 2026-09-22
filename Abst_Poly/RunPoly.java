package Abst_Poly;

class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog sound");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat sound");
    }
}

public class RunPoly {
    public static void main(String[] args) {
        Animal obj = new Dog();
        Animal obj1 = new Cat();
        obj.sound();
        obj1.sound();
    }
}
