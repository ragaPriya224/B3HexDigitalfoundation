package sample.practice.day4.abstraction;

public abstract class Mobile {

    public abstract  void sms(); //abstract method

    public abstract void voice();
    
    public void call(){
        System.out.println("calling");
    }
    
}
//1. abstract method na, no method body
//2. abstract keyword given -> abstract method
//3. abstract method na, class -> abstract class 