import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int j;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break; 
                }
            }
            if (j > i / 2) {  
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
