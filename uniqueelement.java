import java.util.Scanner;
public class uniqueelement{
    static int unique(int[] arr){
        int m=arr.length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<m;i++){
            if(arr[i]!=-1){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the unique number is:"+unique(arr));

    }
}