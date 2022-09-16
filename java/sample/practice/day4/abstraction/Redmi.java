package sample.practice.day4.abstraction;

public class Redmi extends Mobile {

    @Override
    public void sms() {
    System.out.println("welcome redmi user");
        
    }
    
    public static void main(String[] args) {
        Redmi redmi = new Redmi();
        redmi.sms();
    }

    @Override
    public void voice() {
        // TODO Auto-generated method stub
        
    }
    
}
