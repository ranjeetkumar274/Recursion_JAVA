package src.programs;

import java.util.Scanner;

class TotalSum{
    static int sum = 0;
    static int sumofDigits(int n){
        if(n == 0) return sum;
        else
            sum += n%10;
            return sumofDigits(n /= 10);
    }
}
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(TotalSum.sumofDigits(x));
    }
}
