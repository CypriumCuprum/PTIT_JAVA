import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            long n = scanner.nextLong();
            long x = (long)Math.sqrt((double)n);
            if( x*x == n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
