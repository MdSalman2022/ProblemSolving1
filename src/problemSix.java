//Java Program to Swap Two Numbers with third variable

public class problemSix {
    public static void main(String args[]){
        int a=5,b=7,temp;
        System.out.println("Before Swapping value");
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("");
        System.out.println("After Swapping value");
        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }
}
