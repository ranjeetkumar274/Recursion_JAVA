package src.programs;

import java.util.Scanner;

class PrintPower{
    static int power(int a, int b){
        if(b == 1) return a;
        return a * power(a,b-1);
    }
}
public class PowerOfa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(PrintPower.power(a,b));
    }
}
