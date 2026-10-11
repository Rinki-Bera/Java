import java.util.*;
public class TriangleAngles{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter first angle:");
        a=sc.nextInt();
        System.out.print("Enter second angle:");
        b=sc.nextInt();
        System.out.print("Enter third angle:");
        c=sc.nextInt();
        if(a>0 && b>0 && c>0 && a+b+c==180)
        {
            if(a<90 && b<90 && c<90){
                System.out.print("It is an Acute angle triangle");
            }
            else if(a==90 || b==90 || c==90){
                System.out.print("It is a Right angle triangle");
            }
            else{
                System.out.print("It is an Obtuse angle triangle");
            }}
            else {
                System.out.print("Triangle is not possible");
            }
    
    }
}