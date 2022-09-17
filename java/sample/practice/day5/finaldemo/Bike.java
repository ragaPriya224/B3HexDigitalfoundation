package sample.practice.day5.finaldemo;
public  class Bike {
    public final int number = 5;
   public final void display(){
    // number = 10;
    System.out.println(number);
    // System.out.println("user1");
   }
   public static void main(String[] args) {
   Bike bike = new Bike();
   bike.display();
   }
}
//final -> class -> then it cannot be extended 
//final -> method -> then it Cannot override the method 
//final -> variable ->  cannot be assigned