import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] a = {{1 ,8} , {2 ,3}};
        int temp;
        int n = a.length;
        int m = a[0].length;
        for(int i = 0; i < n * m - 1 ;i++) {
            for(int j = 0 ; j < n * m -1;j++){
                if(a[j/m][j%m] > a[(j+1)/m][(j+1)%m]){
                    temp = a[(j+1)/m][(j+1)%m];
                    a[(j+1)/m][(j+1)%m] = a[j/m][j%m];
                    a[j/m][j%m] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
        }




