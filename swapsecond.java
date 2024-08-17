import java.util.Scanner;
public class swapsecond{
    static void swap(int n,int m){
        n=n+m;
        m=n-m;
        n=n-m;
        System.out.println("Value of n is:"+n);
        System.out.println("Value of m is:"+m);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        swap(n,m);

    }
}