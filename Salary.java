import java.util.*;
public class Salary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double bs, da, sa,gross;
        System.out.print("Enter Basic Salary:");
        bs=sc.nextDouble();
        if(bs<=10000){
            da=bs*15/100;
            sa=bs*5/100;
        }
        else if(bs>10000 && bs<=20000){
            da=bs*20/100;
            sa=bs*8/100;
        }
        else if(bs>20000 && bs<=30000){
            da=bs*25/100;
            sa=bs*10/100;
        }
        else{
            da=bs*30/100;
            sa=bs*12/100;
        }
        gross=bs+da+sa;
        System.out.println("Basic Salary=" + bs);
        System.out.println("Dearness Allowance=" + da);
        System.out.println("Special Allowance=" + sa);
        System.out.print("Gross Salary=" + gross);
        
    }
}