import java.util.Arrays;
import java.util.Scanner;

public class Difficult {
    public static void main(String[] args) {
        int a[] = new int[6];
        int[] evens = new int[6];
        int[] odds = new int[6];
        int evenCount = 0, oddCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements:");
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }

        for (int num : a) {
            if (num % 2 == 0) {
                evens[evenCount++] = num;
            } else {
                odds[oddCount++] = num;
            }
        }
            for (int i = 0; i < evenCount-1; i++) {
                int minindex = i;
                for (int j = i + 1; j < evenCount; j++) {
                    if (evens[j] < evens[minindex]) {
                        minindex = j;

                    }
                    int temp = evens[minindex];
                    evens[minindex] = evens[j];
                    evens[j] = temp;
                }
            }
            for(int i=0;i<oddCount-1;i++) {
                for (int j = 3; j <oddCount-i-1 ; j++) {
                        if (odds[j] > odds[j + 1]) {
                            int temp = odds[j];
                            odds[j] = odds[j + 1];
                            odds[j + 1] = temp;
                        }
                    }
                }
        int[] result = new int[6];
        for (int i = 0; i < evenCount; i++) {
            result[i] = evens[i];
        }
        for (int i = 0; i < oddCount; i++) {
            result[evenCount + i] = odds[i];
        }

        System.out.println("Final array (Even-left with Selection Sort, Odd-right with Bubble Sort):");
        System.out.println(Arrays.toString(result));

            }
    }
