import java.util.Scanner;
public class reversearray{
    static int[] reverse(int[] arr){
        int[] ans=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void printarray(int[] arr){
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
        int[] ans=reverse(arr);
        printarray(ans);
    }
}