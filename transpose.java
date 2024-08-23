import java.util.Scanner;
public class transpose{
    static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] trans(int[][] a,int r,int c){
        int[][] b=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                b[j][i]=a[i][j];
            }
        }
        return b;
      
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:");
        int r=sc.nextInt();
        System.out.println("Enter the col:");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int[][] ans=trans(a,r,c);
        print(ans);
       
 
    }
}