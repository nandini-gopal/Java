import java.util.Scanner;

public class count {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number :");
            int n = sc.nextInt();
            // int result=len(n);
            int i=n;
            int count=0;
            if(i==0){
                 count=1;
            }
            else{
                while(i>0) {
                    i /= 10;
                    count++;

            }// System.out.println(count);
            }
            System.out.println(count);


        }
}
