package sample.practice.day3;

public class Dog {
    int size;
    String breed;
    String colour;

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
        eat();

    }

    public void walk() {
        System.out.println("dog is walkiing");
    }

    public static void eat(){
        System.out.println("dog is eating ");
    }
}
