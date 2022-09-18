
import java.util.*;
import java.io.*;


public class MaxAndMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int [] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

                System.out.print(arr[N-1] +" "+ arr[0]);
                System.out.println();

            }

        }

    }

