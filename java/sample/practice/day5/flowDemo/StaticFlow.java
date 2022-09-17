package sample.practice.day5.flowDemo;

public class StaticFlow {
    static int i = 10;  //1  //7

    static {           //2  
        m1();           //8
        System.out.println("1st static block"); //10
    }

    public static void main(String[] args) { //3
        m1();//13
        System.out.println("main");
    }
    public static void m1() {   //4
        System.out.println(j);  //9 //14
    }
    static {  //5
        System.out.println("2nd static block"); //11
    }
    static int j = 20;  //6  //12
}
// 1. identification of static members  from top to bottom[1-6]
//2. execution of static variable assignment and static blocks from top to bottom[6-12]
//3. main method execution


// output:
// 0
//1st static block"
//"2nd static block
//20
//main