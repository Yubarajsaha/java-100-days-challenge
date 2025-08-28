import java.util.*;

public class areaofTriangle {
    public static void main(String[] args) {
        System.out.println("enter wirdth and length of the triangle");
        Scanner sc = new Scanner(System.in);

        int wirdth = sc.nextInt();
        int length = sc.nextInt();
        int area = wirdth*length;

        System.out.println("the area of the retangle is:\n"+area);

        sc.close();
    }
    
}
