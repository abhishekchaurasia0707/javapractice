import java.util.Scanner;
public class sortzerone{
    static int[] sort(int[] arr){
        int cnt=0;
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cnt++;
            }
        }
        for(int i=0;i<cnt;i++){
            ans[i]=0;
        }
        for(int i=cnt;i<arr.length;i++){
            ans[i]=1;
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
        arr=sort(arr);
        print(arr);

    }
}