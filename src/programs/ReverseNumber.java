package src.programs;

import java.util.Scanner;

class Reverse{
    static int newNum = 0;
    static int reverseNum(int n){
        if(n == 0) return newNum;
        else
            newNum = newNum*10 + n%10;
        return reverseNum(n /= 10);
    }
}
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Reverse.reverseNum(x));
    }
}