import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("The sum of a & b is:\n"+sum);

        int subtract=a-b;
        System.out.println("The subtract of a & b is:\n"+subtract);

        int Multiplication=a*b;
        System.out.println("The Multiplication of a & b is:\n"+Multiplication);

        int devide=a/b;
        System.out.println("The devide of a & b is:\n"+devide);
    }
    
}
