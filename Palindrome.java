import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,a,rem,rev=0;
        System.out.print("Enter a number:");
        n=sc.nextInt();
        a=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==a){
            System.out.print(a + " is palindrome");
        }
        else{
            System.out.print(a + " is not palindrome");
        }
    }
}