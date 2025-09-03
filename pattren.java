import java.util.*;
public class pattren {
    public static void main(String args []){

        System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 1; i <=n; i++){//outer loop  
            
            for (int j= 1; j <=i; j++) {    //innner loop
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
