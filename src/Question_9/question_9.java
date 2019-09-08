package Question_9;

import java.util.Scanner;
import java.util.Arrays;

public class question_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array(n): ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter values a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            int a1 = a[i];
            for (int j = 0; j < n; j++) {
                if ((a[j] == a1)) {
                    k++;
                }
            }
            int b1 = 0;
            b[i] = b1;
        }
        int c = 0;
        c = a[0];
        for(int i = 0; i < n; i++){
            if(c < b[i]){
                c = b[i];
            }
        }
        int m = a[0];
        for(int i = 0; i <n; i++) {
            if (c == b[i]) {
                if (n > a[i]) {
                    m = a[i];
                }
            }
        }
        System.out.println();
        System.out.print("The largest number of repetitions at the smallest number: "+m);
        System.out.println();
        System.out.println("Under the index: ");
        for(int i = 0; i < n; i++) {
            if (a[i] == m) {
                System.out.print(i + " ");
            }
        }
    }
}



















