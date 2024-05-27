import java.util.Scanner;

public class StairPath {
    public static int stairs(int n ){
        if(n <= 2) return n;
        return stairs(n-1) + stairs(n-2);
    }

    public static void main(String[] args) {
        //find number of ways to reach nth stairs if 1 or 2 jump at a time is allowed
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        System.out.println(stairs(n));
    }
}
