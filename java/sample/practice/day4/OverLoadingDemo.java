package sample.practice.day4;

public class OverLoadingDemo {
    public static void main(String[] args){
        // printNumber(5,55.3d);

        byte mark = 5;
        printNumber(mark);
        long wheel = 4444L;
        // printNumber(wheel); //compilation error.
        printNumber(true);
    }
    public static void printNumber(boolean isCheck){
        System.out.println("0");
        System.out.println(isCheck);
    }
    public static void printNumber(int num){
        System.out.println("1");
        System.out.println(num);
    }
    public static void printNumber(int num, double num2){
        System.out.println("2");
        System.out.println(num);
    }
    public static void printNumber(String name){
        System.out.println("3");
        System.out.println(name);
    }
}
