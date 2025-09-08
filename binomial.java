import java.util.*;
public class bionomial {

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int biocof(int n,int k){
        int n_fact=factorial(n);      // factorial of n//

        int k_fact=factorial(k);       //factorial of k//

        int fact_n_k = factorial(n - k);   //n-k factorial;

        int bionom= n_fact/(k_fact*fact_n_k);   //bionomial coefficient n!/k!*n-k!
        
        System.out.println("the bionomail cofficient of n and k is:\n"+bionom);
        return bionom;
    }

    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        biocof(a, b);
        sc.close();
        
    }
}
