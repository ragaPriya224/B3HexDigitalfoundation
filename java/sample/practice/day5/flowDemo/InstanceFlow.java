package sample.practice.day5.flowDemo;

public class InstanceFlow {
    int i = 10; //3 //9
    {  //4
        m1();//10
        System.out.println("first block");//12
    }

    InstanceFlow() {  //5
        System.out.println("CONSTRUCTOR"); //15
    }

    public static void main(String[] args) {//1
        InstanceFlow i = new InstanceFlow(); //2
        System.out.println("main method"); //16
        InstanceFlow i2 = new InstanceFlow(); //17
    }

    public void m1() {   //6
        System.out.println(j);//11
    }

    {  //7
        System.out.println("second block");//13
    }
    int j = 20; //8//14
}


//a. static flow will happen    [1,2]
// 1. identification of instance VARIABLE, BLOCKS, METHODS,CONSTRUCTOR  from top to bottom -3-8
//2. execution of instance variable assignment and instance blocks from top to bottom 9-14
//3. constructor  execution

// OUTPUT:
// 0
// first block
// second block
//CONSTRUCTOR
//"main method 
//AGAIN REPEATED

// 1. identification of instance VARIABLE, BLOCKS, METHODS,CONSTRUCTOR  from top to bottom -3-8
//2. execution of instance variable assignment and instance blocks from top to bottom 9-14
//3. constructor  execution

// STATIC FLOW -> 1ly once
// INSTANCE FLOW -> FOR EVERY OBJECT CREATED, IT WILL HAPPEN EVERYTIME