package sample.practice.day7;

public class ForEachLoopDemo {
    public static void main(String[] args) {

        String[] carsArray = {"Volvo", "BMW", "Ford", "Mazda"};
         ForEachLoopDemo demo = new ForEachLoopDemo();


        for(String car:carsArray){
           System.out.println(car);
            }
    }
}
