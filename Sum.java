import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n,rem,sum=0;
        System.out.print("Enter the number:");
        n=sc.nextInt();
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.print("Sum of digits=" + sum);
    }
}