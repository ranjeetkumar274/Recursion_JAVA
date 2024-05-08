import java.util.Scanner;

public class PrintNto1 {
     static void printnumbers(int n){
        if(n == 1){
            System.out.println(1);
        }
        else{
            System.out.print(n+" ");
            printnumbers(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value : ");
        int n = sc.nextInt();
        printnumbers(n);
    }
}
