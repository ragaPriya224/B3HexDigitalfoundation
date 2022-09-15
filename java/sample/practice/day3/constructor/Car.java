package sample.practice.day3.constructor;

public class Car {

    String color;
    int wheels;

    Car(){
        this.wheels = 4;
        this.color = " red";
    }

    Car(String color,int wheels ){
        this.wheels = wheels;
        this.color = color;
    }

    public static void main(String[] args) {
        //object creation
        Car bmw = new Car("blue",6 );
        // bmw.color = "blue";
        // bmw.wheels = 6;
        System.out.println(bmw.color);
        System.out.println(bmw.wheels);

        //object creation
        Car audi = new Car();
        // audi.color = "black";
        // audi.wheels = 4;
        System.out.println(audi.wheels);
        System.out.println(audi.color);

    }
}
