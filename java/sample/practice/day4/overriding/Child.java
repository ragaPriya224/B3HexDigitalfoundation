package sample.practice.day4.overriding;

public class Child extends Parent{
    public static void main(String[] args) {
        Child c = new Child();
        c.wealth();
        c.toMarry();
        c.toEat();
    }
    //overrided
    public void toMarry(){
        System.out.println("user2");
    }
    public void toEat(){
        super.toEat();
        System.out.println("coke");
    }
}
// visibility should not be decreased 
