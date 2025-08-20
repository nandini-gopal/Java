import java.util.Scanner;

abstract class Banking {
    abstract void calculate();
    abstract void display();
}
class Upi extends Banking{
    double m;
    double tax;
    Upi(double m){
        this.m=m;
    }
    void calculate(){
        tax=m*0.20;
    }
    void display(){
        System.out.println(tax);
    }
}
class Online extends Banking{
    double m;
    double tax;
    Online(double m){
        this.m=m;
    }
    void calculate(){
        tax=m*0.150;
    }
    void display(){
        System.out.println(tax);
    }
}
class Siri{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount:");
        int m=sc.nextInt();
        Banking obj=new Upi(m);
        obj.calculate();
        obj.display();
        Banking obj1=new Online(m);
        obj1.calculate();
        obj1.display();
    }
}


