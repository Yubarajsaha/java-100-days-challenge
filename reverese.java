public class reverese {
    public static void main(String[] args) {
        ///reverse of a number
        int n = 123456;
        while(n>0){
            int x =n%10;
            System.out.println(x);
            n=n/10;
            
        }
        System.out.println();
    }
}
