import java.util.Scanner;
public class swapfirst{
    static void swap(int n,int m){
        int temp=n;
        n=m;
        m=temp;
        System.out.println("value of n:"+n);
        System.out.println("value of m:"+m);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        System.out.println("enter the value of m:");
        int m=sc.nextInt();
        swap(n,m);
    }
}