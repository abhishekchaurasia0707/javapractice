import java.util.Scanner;
public class firstrepeating{
    static int firstrepeat(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the size:");
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println(firstrepeat(arr));
    }
}