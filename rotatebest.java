import java.util.Scanner;
public class rotatebest{
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr,int l,int h){
         h=arr.length-1;
        for(int i=l;l<h;){
            swap(arr,l,h);
            l++;
            h--;
        }
    }
    static void rotate(int[] arr,int k){
       int n=arr.length;
       k=k%n;
       reverse(arr,0,n-k-1);
       reverse(arr,n-k,n-1);
       reverse(arr,0,n-1);  
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
        rotate(arr,k);
        print(arr);
    }
}