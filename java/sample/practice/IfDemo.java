package sample.practice;

public class IfDemo {
    public static void main(String[] args) {
        int money = 4;
        int penPrice = 10;
        int pencilPrice = 5;
        if(money >= 150){
            System.out.println("yes u can buy special  pen ");
        } else if(money >= penPrice){
            System.out.println("yes u can buy pen ");
        } else if(money >=pencilPrice){
            System.out.println("yes u can buy pencil ");
        } else{
            System.out.println(" let's go home ");
        }
    }
}
