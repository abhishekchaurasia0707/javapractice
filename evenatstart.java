import  java.util.Scanner;
import java.util.Arrays;
public class evenatstart{
    static int[] evenat(int[] arr){
        int[] ans=new int[arr.length];
        int  j=0;
        int  cnt=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                cnt++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ans[j++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0)
                    ans[j++]=arr[i];
                }
        return ans;
        
    }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] y=evenat(arr);
        //System.out.println(y);
        print(y);
    }
}