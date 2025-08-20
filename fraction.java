import java.util.Scanner;
public class fraction {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the m :");

            int m = sc.nextInt();
                double harmonic = 0.0;
                for (int i = 1; i <= m; i++) {
                    harmonic += 1.0 / i;
                }
                double seriesSum = harmonic / 2;
                System.out.printf("Sum of series 1/2 + 1/4 + ... + 1/%d is: %.6f\n", 2 * m, seriesSum);
    }
}
