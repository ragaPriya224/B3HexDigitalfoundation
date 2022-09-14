package sample.practice;

public class CitizenDemo {
    public static void main(String[] args) {
        int age = 50;
        String citizenship = "indian";
        if (age >= 18  && citizenship == "indian") {
            System.out.println("hey, u can vote ");
        }else{
            System.out.println("sorry, u can't vote ");
        }

    }

}
