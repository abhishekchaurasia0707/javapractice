import java.util.Scanner;
class occurence{
    static int occure(int[] arr,int x){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();

        System.out.println("The number of occurence:"+occure(arr,x));
        sc.close();
    }
}