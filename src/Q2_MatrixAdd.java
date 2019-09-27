import java.util.*;
public class Q2_MatrixAdd {
    public static void main(String[] args) {
        int m, n;
        System.out.println("enter dimensions of the matrices");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int mat1[][] = new int[m][n];
        int mat2[][] = new int[m][n];
        System.out.println("enter the elements of 1st matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the elements of 2nd matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat1[i][j] + mat2[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
