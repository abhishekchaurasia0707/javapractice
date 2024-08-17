import java.util.Scanner;
public class Revers{
    static void swap(int[] arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int[] arr){
        //int l=0;
        int h=arr.length-1;
        for(int l=0;l<h;l++){
            swap(arr,l,h);
            l++;
            h--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        print(arr);
    }
}