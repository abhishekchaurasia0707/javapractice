import java.util.Scanner;
public class matrixmul{
    static void printarray(int[][] Matrix){
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                System.out.print(Matrix[i][j]+" ");
               
            }
             System.out.println();
            }

        }
    
    static void mult(int[][] A,int r1,int c1,int[][] B,int r2,int c2){
        if(c1!=r2){
           System.out.println("Multiplication not possible:"); 
           return;
        }
        int[][] M=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    M[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("Multiplication Matrix:");
        printarray(M);
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the row:");
    int r1=sc.nextInt();
    System.out.print("Enter the col:");
    int c1=sc.nextInt();
    int[][] A=new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            A[i][j]=sc.nextInt();
        }
    }
    System.out.println();
    System.out.print("Enter the row:");
    int r2=sc.nextInt();
    System.out.print("Enter the col:");
    int c2=sc.nextInt();
    int[][] B=new int[r2][c2];
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            B[i][j]=sc.nextInt();
        }
    }
    System.out.println("Matrix A:");
    printarray(A);
    System.out.println("Matrix B:");
    printarray(B);
    System.out.println("Matrix M:");
    mult(A,r1,c1,B,r2,c2);

  }
}