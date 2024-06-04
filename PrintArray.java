import java.util.Scanner;

public class PrintArray {

    public static void printArray(int n, int[] nums){
        if(n == nums.length) return;
        System.out.print(" "+nums[n]);
        printArray(n+1 , nums);
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int[] nums = {5,5,6,7,9,5,2,4,6,4,8};
        int n = nums.length;
        printArray(0 , nums);
    }
}
