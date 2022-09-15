package sample.practice.day3.inheritance;

public class Dog extends Animal{
    //parent class -> animal
    //child class -> Dog
    public static void main(String[] args) {
        Dog lab = new Dog();
        System.out.println(lab.age);
        lab.eat();
    }
   
}
