package sample.practice.day3;

public class Demo {
    public static void main(String[] args) {
        Dog animal = new Dog(); 
        animal.walk();
        System.out.println(animal.size);
        animal.colour= "white";
        System.out.println(animal.colour);

        Dog lab = new Dog();
        System.out.println(lab.breed);
        System.out.println(lab.colour);


        Dog.eat();
    }
}
