import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        System.out.println("enter the number which multiplication table you want to see ");
        
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        for (int i = 0; i < 10; i++) {

            System.out.println(n+"x"+i+"="+(n*i));
        }
        System.out.println();
        sc.close();
    }
    
}
