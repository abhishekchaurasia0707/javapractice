import java.util.Scanner;
public class frequecyarray{
    static int[] makefrequency(int[] arr){
        int[] freq=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] freq=makefrequency(arr);
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter the number to search:");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            q--;
        }
    }
}