
import java.util.Scanner;

public class functions1 {

    public static void  Squar(int a){
        if(a!=0){
            System.out.println(a*a*a);
        }
        else{
            System.out.println("squar of this number not possible");
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        Squar(num);
        sc.close();
    }
    
}
