import java.util.*;
public class Area{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int ch;
        System.out.println("1. Area of Rectangle.");
        System.out.println("2. Area of Square.");
        System.out.println("3. Area of Circle.");
        System.out.println("4. Area of Triangle.");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        switch(ch){
            case 1 -> {
            double l,b;
            System.out.println("Enter length & breadth:");
            l=sc.nextDouble();
            b=sc.nextDouble();
            System.out.println("Area of Rectangle=" +(l*b));
        }
            case 2 ->{
                double a;
            System.out.println("Enter side:");
            a=sc.nextDouble();
            System.out.println("Area of Square=" +(a*a));
            }
            case 3 ->{
                double r;
            System.out.println("Enter radius:");
            r=sc.nextDouble();
            System.out.println("Area of Circle=" +(3.14*r*r));
            }
            case 4 ->{
            double ba,h;
            System.out.println("Enter base & height:");
            ba=sc.nextDouble();
            h=sc.nextDouble();
            System.out.println("Area of Triangle=" +(0.5*ba*h));
        }
        default -> {
            System.out.print("Invalid Choice");
        }
        }
    }
}