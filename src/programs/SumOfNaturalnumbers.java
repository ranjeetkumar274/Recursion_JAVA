package src.programs;

import java.util.Scanner;

class PrintSum{
    static int sum(int n){
        if(n == 1) return 1;
        return n+sum(n-1);
    }
}
public class SumOfNaturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        System.out.println(PrintSum.sum(x));
    }
}
