import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Please give me a whole number: ");
        int number1= sc.nextInt();
        System.out.println("Please give me another whole number: ");
        int number2= sc.nextInt();
        int product= number1*number2;
        int product1=multiply(number1,number2);
        System.out.println("Our product is " + product1) ;
    }
    public static int multiply(int num1,int num2){
        int product =num1*num2;
        return product;
    }
}
