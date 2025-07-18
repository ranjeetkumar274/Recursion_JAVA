package src.basics;

class Demo0{
    void m0(int x){
        if(x == 1) return;
        System.out.println("Hello world!");
        x--;
        m0(x);
    }
}
public class FiniteRecursion {
    public static void main(String[] args) {
        Demo0 demo0 = new Demo0();
        int x = 10;
        demo0.m0(x);
    }
}
