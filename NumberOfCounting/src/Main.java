import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int A;
        int B;
        int C;
        int mul = 0;
        int[] mul_array;
        int[] countNumber = new int[10];

        Scanner scanner = new Scanner(System.in);

        A = Integer.parseInt(scanner.nextLine());
        B = Integer.parseInt(scanner.nextLine());
        C = Integer.parseInt(scanner.nextLine());

        while (true) {
            
            mul = A*B*C;// A x B x C
            if(!checkNumbers(A, B, C)) break;
        }// 99 < A,B,C < 1000

        if (mul > 999999) {
            mul_array = intToArrayint(mul);

            for (int i = 0; i < mul_array.length; i++) {
                for (int j = 0; j < countNumber.length; j++) {
                    if (mul_array[i] == j) {
                        countNumber[j]++;    
                    }
                    
                }
            }
        }

        for (int i = 0; i < countNumber.length; i++) {
            System.out.println(countNumber[i]);
        }
        
    }

    public static boolean checkNumbers(int A, int B, int C) {
        boolean checkABC = true;
        if ((99 < A) && (A < 1000)) {
            checkABC = false;
        } else {
            return true;
        }
        if ((99 < B) && (B < 1000)) {
            checkABC = false;
        } else {
            return true;
        }
        if ((99 < C) && (C < 1000)) {
            checkABC = false;
        } else {
            return true;
        }

        return checkABC;
    }
    public static int[] intToArrayint(int n) {
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while (n != 0) {
            arr[len - j - 1] = n % 10;
            n = n / 10;
            j++;
        }
        return arr;
    }
}
