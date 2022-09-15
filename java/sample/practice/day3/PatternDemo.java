package sample.practice.day3;

 class PatternDemo {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){ //number of rows
            for(int j = 1; j<=i; j++){ //columns
              System.out.print(j);
            } 
            System.out.println();
        }
    }
}
