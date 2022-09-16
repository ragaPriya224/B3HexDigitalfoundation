package sample.practice.day4.abstraction;

public abstract class Samsung extends Mobile {

    @Override
    public void sms() {
        System.out.println("hello samsunguser");

    }
    public static void main(String[] args) {
        // Samsung samsung = new Samsung();
        // samsung.call();
        // samsung.sms();
    }

}
//1. if u make your class as abstract class, 
//    u don't have to give implementation for all methods\
//2. if abstract class, then can't create object
