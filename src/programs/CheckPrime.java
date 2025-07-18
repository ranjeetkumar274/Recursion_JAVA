package src.programs;

import java.util.Scanner;

class CheckForPrime{
    static boolean prime(int n, int i){
        if(i == 1) return true;
        else if (n%i == 0) {
            return false;
        }
        else return prime(n,--i);

    }
}
public class CheckPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CheckForPrime.prime(n,n/2));
    }
}
