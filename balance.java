import java.util.Scanner;

public class balance {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of name:");
        String a = sc.next();
        System.out.println("enter the value of age :");
    int b = sc.nextInt();
        System.out.println("enter the value of number:");
    int c = sc.nextInt();
        System.out.println("enter the value of account balance:");
    int d = sc.nextInt();
        System.out.println("enter the value of gender:");
    String e = sc.next();
        System.out.println("1.enter the value of loan:");
        System.out.println("2.enter the value of deposit:");
        System.out.println("3.enter the value of withdraw:");
        System.out.println("4.enter the details:");

        System.out.println("enter your choice:");
    int choice = sc.nextInt();
        switch(choice)

    {
        case 1:
            System.out.println("enter the principle");
            int p=sc.nextInt();

            System.out.println("enter the loan amount");
            int f = sc.nextInt();
            System.out.println("enter the value of years:");
            int g = sc.nextInt();
            double rate = 9.1;
            double interest = (p * g * rate) / 100;
            double money = f + rate;
            System.out.println(interest);
            System.out.println(money);
            break;
        case 2:
            System.out.println("enter the deposit ammount:");
            int dep = sc.nextInt();
            d += dep;
            System.out.println(d);
            break;
        case 3:
            System.out.println("enter the amount of withdraw");
            int wd = sc.nextInt();
            if (wd <= d) {
                d -= wd;

                System.out.println(d);
            } else {
                System.out.println("not withdraw");
            }
            break;
        case 4:
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            break;
        default:
            System.out.println("invalid choice");
    }
}
}
