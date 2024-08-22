import java.util.Scanner;
public class addtwod{
    static void printarray(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int[][] A1,int r1,int c1,int[][] B1,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Not possible");
            return;
        }
        int[][] sum=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                sum[i][j]=A1[i][j]+B1[i][j];
            }
        }
        printarray(sum);
    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int r1=sc.nextInt();
         int c1=sc.nextInt();
         int[][] A1=new int[r1][c1];
         for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A1[i][j]=sc.nextInt();
            }
         }
         int r2=sc.nextInt();
         int c2=sc.nextInt();
         int[][] B1=new int[r2][c2];
         for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B1[i][j]=sc.nextInt();
            }
         }

         System.out.println("Matrix 1");
         printarray(A1);
         System.out.println("Matrix 2");
         printarray(B1);
         System.out.println("Sum Matrix");
         add(A1,r1,c1,B1,r2,c2);
    }
}