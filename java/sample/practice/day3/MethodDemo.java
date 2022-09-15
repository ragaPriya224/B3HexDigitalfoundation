package sample.practice.day3;

public class MethodDemo {
    public static void main(String[] args) {
        toSubtract("user");
        toAdd(10, 3);
    }

    public static int toAdd(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
        return result;
    }

    public static void toSubtract(String name) {
        System.out.println(5 - 3);
        System.out.println(name);
    }

}
