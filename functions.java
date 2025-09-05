
import java.util.Scanner;

public class functions {

    public static void isEven(int a){
    if(a%2==0){
    System.out.println("it is even number");
    }
    else
    {
        System.out.println("it is an odd number");
    }

    }




    public static void main(String[] args) {
        
        //chack the number  is it even of not //
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isEven(num);
    }
    
}
