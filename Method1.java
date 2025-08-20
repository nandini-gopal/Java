import java.util.Scanner;

public   class Method1 {
  //  public static void main(String []args){
String s,gender;
        int a,s1,s2,s3;
        void getdetails() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the name:");
             s =sc.next();
            System.out.println("enter the age:");
            a = sc.nextInt();
            System.out.println("enter the gender:");
             gender = sc.next();
        }
        void   marks() {
           Scanner sc = new Scanner(System.in);
            System.out.println("enter the subj1:");
             s1 = sc.nextInt();
            System.out.println("enter the sub2:");
             s2 = sc.nextInt();
            System.out.println("enter the sub3:");
             s3 = sc.nextInt();
            int result=s1+s2+s3;
            double avg=result/3;
            System.out.println(avg);
            double precentage=(result/300.0)*100;
            System.out.println(precentage);
        }
        public static void main(String[]args){
            Method1 obj=new Method1();
            obj.getdetails();
            obj. marks();

        }




        }

