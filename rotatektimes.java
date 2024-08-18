import java.util.Scanner;
public class rotatektimes{
    static int[] rotate(int[] arr,int k){
        int m=arr.length;
        int[] ar=new int[m];
        k=k%m;
        int j=0;
        for(int i=(m-k);i<m;i++){
            ar[j++]=arr[i];
        }
        for(int i=0;i<=(m-k-1);i++){
            ar[j++]=arr[i];
        }
        return ar;
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
        int k=sc.nextInt();
        arr=rotate(arr,k);
        print(arr);
    }
}