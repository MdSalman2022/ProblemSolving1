//Java Program to Find the Largest Among Three Numbers

public class problemTen {
    public static void main(String args[]){
        int a=3,b=7, c=9;

        if(a>b && b>c){
            System.out.println(a + " is the largest number");
        }
        else if(b>a && b>c){
            System.out.println(b + " is the largest number");
        }
        else if(c>a && c>b){
            System.out.println(c + " is the largest number");
        }
    }
}
