import java.util.*;
public class log {
    public static void main(String[] args) {
        System.out.println("enter the id and the password");
        Scanner sc = new Scanner(System.in);
        
        int userId =12369;
        int password = 1234567;
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(userId==a && password==b)
        {
        System.out.println("Log in succesfully");
        }

        else if (userId == a && password != b) {
            
            System.out.println("Password is incorrect plaese try again");
        }

        else if (userId !=a && password == b) {
            
            System.out.println("userid is incorect please try again");
        }

        else{

            System.out.println("Both are incorrect please try again");
        }
    

        sc.close();
    }
}
