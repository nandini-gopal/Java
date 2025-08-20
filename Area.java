import java.util.Scanner;
public class Area {
    static  double area(int r ){
        return r*r;
    }
    static double area(double  a){
        double PI=3.14;
        double circle=PI*a*a;
        return circle;
    }
    static int area(int p,int q){
        return p*q;
    }
    static double area(double base,double h){
        double j=0.5*base*h;
        return j;
    }
    public static void main(String[]arga) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice:");
        int ch =sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("enter radius");
                int r=sc.nextInt();
                double s=area(r);
                System.out.println(s);
                break;
            case 2:
                System.out.println("enter  circle radius");
                int a=sc.nextInt();
                double k=area(a);
                System.out.println(k);
                break;
            case 3:
                System.out.println("enter  the rect of p");
                int p=sc.nextInt();
                System.out.println("enter  the q");
                int q=sc.nextInt();
                double l=area(4,5);
                System.out.println(l);
                break;
            case 4:
                System.out.println("enter  the base of tri");
                int base=sc.nextInt();
                System.out.println("enter  the h");
                int h=sc.nextInt();
                double m=area(23.5,7.8);
                System.out.println(m);
                break;
            default:
                System.out.println("invalid");
        }

    }
}
