import java.util.*;
public class checkNum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        char c;
        System.out.print("Enter a character");
        c=sc.next().charAt(0);
        if(c>='A' && c<='Z'){
            System.out.print("It is an uppercase character");
        }
            else if(c>='a' && c<='z'){
                System.out.print("Is is a lowercase character");
        }
        else if(c>='0' && c<='9'){
                System.out.print("Is is a digit");
        }
        else{
                System.out.print("Is is a special character");
        }
        
        
        
        
    }
}