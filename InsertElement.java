import java.util.*;
public class InsertElement{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int a[]=new int[100];
        int i,n,pos,element;
        System.out.print("Enter number of elements:");
        n=sc.nextInt();
        System.out.print("Enter array elements:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter position to insert:");
        pos=sc.nextInt();
        System.out.print("Enter element to insert:");
        element=sc.nextInt();
        if(pos<1 || pos>n+1){
            System.out.print("Invalid position");
        }
        else{
            for(i=n;i>=pos;i--){
                a[i]=a[i-1];
            }
            a[pos-1]= element;
            n++;
            System.out.print("Array after insertion:");
            for(i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }
        sc.close();
    }
}