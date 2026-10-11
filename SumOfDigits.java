import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int d1,d2,d3,d4,num,sum;
        System.out.print("Enter a 4-digit number:");
        num=sc.nextInt();

        d1=num%10;
        num=num/10;

        d2=num%10;
        num=num/10;

        d3=num%10;
        num=num/10;

        d4=num%10;

        sum=d1+d2+d3+d4;

        System.out.println("Sum of digits=" +sum);
    }
}