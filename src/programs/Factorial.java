package src.programs;

import java.util.Scanner;


    class FindFact{
        static int fact(int a){
            if(a == 0) return 1;
            return a * fact(a-1);
        }
    }
    public class Factorial{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a  = sc.nextInt();
            System.out.println(src.programs.FindFact.fact(a));
        }
    }
