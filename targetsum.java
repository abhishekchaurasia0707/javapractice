import java.util.Scanner;
public class targetsum{
    static int pairsum(int[] arr,int x){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of x:");
        int x=sc.nextInt();
        System.out.println("Total number of  pairs:"+pairsum(arr,x));
    }
}