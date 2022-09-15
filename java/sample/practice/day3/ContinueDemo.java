package sample.practice.day3;

public class ContinueDemo {
    public static void main(String[] args) {
       for(int i = 0 ; i < 5; i++){
        if(i == 3){
           continue; // that particular iteration is skipped
        }
        System.out.println("hello" +i);
       } 
    }
}