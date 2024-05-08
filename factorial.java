import java.util.Scanner;

public class factorial {

    static int calculatefact(int n ){
        if (n == 1) {
            return 1;
        }
        else{
            return n * calculatefact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 0;
        System.out.print("Enter your value : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
             fact = calculatefact(n);
        }
        System.out.println("Your factorial is : "+fact);
    }
}
