import java.util.Scanner;
import java.util.Arrays;
public class kthlargest{
    static int klargest(int[] arr,int k){
          Arrays.sort(arr);
          return arr[arr.length-k];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of k:");
        int k=sc.nextInt();
        System.out.println("The kth largest element of the array is:"+klargest(arr,k));
    }
}