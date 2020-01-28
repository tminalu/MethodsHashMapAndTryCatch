public class TryCatch {
    public static void main(String[] args) {
        int num1,num2;
        try{
            num1=0;
            num2=30 / num1;
            System.out.println(num2);
            //good practise to know where we at in handling error
            System.out.println("I am in try block");

        }
        catch(Exception e){
            //it will jump from 6 to 14 because of the exception(error)
            System.out.println("Exception occured");

        }
        System.out.println("I am outside try - catch block");
    }
}
