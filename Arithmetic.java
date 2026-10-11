import java.util.*;
public class Arithmetic{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double a,b;
        String result;
        char op;
        System.out.println("Enter first number:");
        a=sc.nextDouble();
        System.out.println("Enter second number:");
        b=sc.nextDouble();
        System.out.println("Enter the operator(+,-,*,/,%):");
        op=sc.next().charAt(0);
        result=switch(op){
            case '+' -> "" +(a+b);
            case '-' -> "" +(a-b);
            case '*' -> "" +(a*b);
            case '/' -> "" +(a/b);
            case '%' -> "" +(a%b);
            default -> "Invalid Operator";
        };
        System.out.print("Result=" + result);
    }
}