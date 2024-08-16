import java.util.Scanner;
public class secondlargest{
    static int findMax(int[] arr){
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondMax(int[] arr){
        int mx=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secMax=findMax(arr);
        return secMax;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //int res=findMax(arr);
    System.out.println("the secont maximum is:"+secondMax(arr));
    }
    
}