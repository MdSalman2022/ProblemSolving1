public class problemTwelve {
    public static void main(String args[]){
        int year=1900;

        if(year%400==0){
            System.out.println(year + " is a Leapyear");
        }
        else if(year%100==0){
            System.out.println(year + " is not a leapyear");
        }
        else if(year%4==0){
            System.out.println(year + " is a Leapyear");
        }

    }
}
