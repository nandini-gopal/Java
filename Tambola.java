import java.util.Random;
import java.util.Scanner;
//import java.util.Random;
public class Tambola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("enter the no.of players:");
        int a = sc.nextInt();
        if (a < 2 || a > 5) {
            System.out.println("invalid");
            return;
        }
//assign 9 elemnts
        int[] ticket = new int[9];
        System.out.println("enter ticket elements:");
        for (int i = 0; i < 9; i++) {
            ticket[i] = rand.nextInt(100)+1;
            System.out.print(ticket[i] +" ");
        }
        System.out.println();
        // random elemts
        int num[][] = new int[a][10];
        for (int i = 0; i < a; i++) {
            System.out.println("player:" + (i + 1) +  "values");
            for (int j = 0; j < 10; j++) {
                num[i][j] = rand.nextInt(100)+1;
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        // matching values
        int match[] = new int[a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 9; k++) {
                    if (num[i][j] == ticket[k]) {
                        match[i]++;
                    }
                }
            }
        }
        int winner = 0;
        int max = match[0];
        for (int i = 1; i < a; i++) {
            if (match[i] > max) {
                max = match[i];
                winner = i;
            }
        }
        for(int i=0;i<a;i++){
            System.out.println("player:"  +(i+1)+ "matches:" +match[i]);
        }
        System.out.println(winner + 1);
    }
}

