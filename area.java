import java.util.*;

public class area {
    public static void main(String[] args) {
        System.out.println("enter the redius of a circle");
        Scanner sc =new Scanner(System.in);
        
        int redius=sc.nextInt();
        double r=3.14;

        // area of the circle 
        double area=r*redius*redius;
        System.out.println("the area of the circle is:\n "+area);

        sc.close();
    }
    
}
