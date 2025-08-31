import java.util.*;
public class VotingAge {
    public static void main(String[]args)
    {
        System.out.println("enter the age of voter");
        Scanner sc = new Scanner(System.in);
            int age=sc.nextInt();
            if(age>18)
            {
                System.out.println("he/she is eligible for vote");
            }
            else
            {
                System.out.println("He/she is not eligible for vote ");
            }
        sc.close(); 
    }

} 