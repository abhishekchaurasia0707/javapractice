import java.util.Scanner;
public class prefixsum{
    static int[] runningsum(int[] arr){
        int[] ans=new int[arr.length];
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i]=ans[i-1]+arr[i];
        }
        return ans;
    }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] m=runningsum(arr);
        print(m);
        

    }
}