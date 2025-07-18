package src.basics;

class Demo{
    void m(){
        System.out.println("Hello World!");
        m();    //her we are making infinite calls
    }
}
public class InfiniteRecursion {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.m();
    }
}
