import java.util.Arrays;
public class leetcode1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 3};
        int n = a.length;
        int target = 3;
        int k=0;
        for (int i = 0; i < n; i++) {
            if (a[i]!= target) {
                a[k++]=a[i];
            }
        }
        System.out.print("Remaining elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }}

