import java.util.Scanner;

import java.util.Scanner;
public class Physics {

        public boolean CalculateSum(int n,int x[][]){
            int[] sum = new int[3];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < 3; j++)
                    sum[j] += x[i][j];
            if (sum[0] == 0 && sum[1] == 0 && sum[2] == 0) {
                System.out.println("YES");
                return true;
            } else {
                System.out.println("NO");
                return false;
            }
        }
        public static void main(String[] args) {
            Scanner var = new Scanner(System.in);
            int n = var.nextInt();
            int[][] arr = new int[n][3];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < 3; j++)
                    arr[i][j] = var.nextInt();
            var young = new Physics();
            young.CalculateSum(n,arr);
        }
    }


