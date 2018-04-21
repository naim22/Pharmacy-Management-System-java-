
public class Calculator {
     private int num1;
   private int num2;
 

    
    Calculator(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }
    
    int calc(){
        int sum = num1 * num2;
        return sum;
    }
}
