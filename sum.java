import java.util.*;

public class sum {
    public static void main(String args[])
    {
        System.out.println("enter the numbers");
        //use Scanner class for user input //
        Scanner sc=new Scanner(System.in); 

        int a = sc.nextInt();
        int b =sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of a+b\n"+sum);

        sc.close();
    }
    
}
