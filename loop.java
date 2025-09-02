
import java.util.Scanner;

public class loop {
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        while (i<=num){ 
            sum +=i;
            i++;
            System.out.println(sum);
        }
        System.out.println("printed 10th of sum ");
        sc.close();
    }
}
