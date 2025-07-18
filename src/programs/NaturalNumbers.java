package src.programs;

import java.util.Scanner;

class PrintNaturalNum{
    static void print(int x){
        if(x >= 1){
            print(x-1);
            System.out.println(x+" ");
        }
        else return;
    }
}
public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        PrintNaturalNum.print(x);
    }
}
