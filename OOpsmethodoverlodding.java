public class OOps {
    public static void main(String args[]){
    Calculator calc = new Calculator();
    System.out.println(calc.sum(1,2));
    System.out.println(calc.sum((float)1.3,(float)2.6));
    
    }
}
class Calculator {
    int sum( int a , int b){
        return a+b;
    }
    float sum( float a , float b){
        return a+b;
    }
}
