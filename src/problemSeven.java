//Java Program to Swap Two Numbers without third variable

public class problemSeven {
    public static void main(String args[]){
        int a=15,b=20;

        System.out.println("Before Swapping value");
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("");
        System.out.println("After Swapping value");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
