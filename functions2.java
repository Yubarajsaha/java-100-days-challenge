import java.util.*;
public class functions2 {

    public static void addition(int a,int b){
    int sum=a+b;
    System.out.println(sum);
    return;
    }

    public static void subtraction(int a,int b){
    int sub=a-b;
    System.out.println(sub);
    return;
    }

    public static void multiplication(int a,int b){
    int multi=a*b;
    System.out.println(multi);
    return;
    }

    public static void division(int a,int b){
    int div=a/b;
    System.out.println(div);
    return;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the option "); //choose option for which you want to perform //
        int calculation =sc.nextInt();
        System.out.println("enter the first number");   //first number//
        int num1=sc.nextInt();
        System.out.println("enter the second number");  //second number//
        int num2=sc.nextInt();
        

        switch (calculation) {

            //additon//
            case 1:
                System.out.println("sum of num1 & num2 is:");
                addition(num1,num2);
                
                break;

            //subtraction//
            case 2:
            System.out.println("subtraction of num1 & num2 is:");
            subtraction(num1, num2);
                break;

            //multiplication//
            case 3:
                System.out.println("multiplication of num1 & num2 is:");
                multiplication(num1, num2);
                
                break;

            //Division
            case 4:
                System.out.println("div of num1 & num2 is:");
                division(num1, num2);
                
                break;
            default:
                System.out.println("error");;
        }
        System.out.println("successful");
        sc.close();
    }

    
}
