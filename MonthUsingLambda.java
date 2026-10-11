import java.util.*;
public class MonthUsingLambda{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter any month number:");
        n=sc.nextInt();
        String r=" ";
        r=switch(n){
            case 1 -> "January";
             case 2->"Feb";
             case 3->"March";
             default ->"Invalid";
        };
        System.out.println(r);
    }
}