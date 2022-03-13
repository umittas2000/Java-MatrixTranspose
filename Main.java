import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] Matrix = { {2,4,6,3,1},{6,7,8,9,10},{99,88,77,66,55}};

        int[][] Transpose = new int[Matrix[Matrix.length-1].length][Matrix.length];

       System.out.println("Matrix: [" + Matrix.length + "][" +Matrix[Matrix.length-1].length + "]");

       System.out.println("Transpose: [" +Transpose.length+ "][" + Transpose[Transpose.length-1].length +"]");

       for(int i=0;i<Matrix.length;i++){
           for(int j=0;j<Matrix[i].length;j++){
               Transpose[j][i]=Matrix[i][j];
               System.out.print(Matrix[i][j] + " ");
           }
           System.out.println();
       }
        System.out.println("-------------------------");
       for(int i=0;i<Transpose.length;i++){
           for(int j=0;j<Transpose[i].length;j++){
               System.out.print(Transpose[i][j] + " ");
           }
           System.out.println();
       }
    }
}
