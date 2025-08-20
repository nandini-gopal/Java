import java.util.Scanner;

public class Details {
    String mname;
    int mquantity;
    int mprice;

    Details(String mname, int mquantity, int mprice) {
        this.mname = mname;
        this.mquantity = mquantity;
        this.mprice = mprice;
    }
    void display() {
        System.out.print("name:" + mname);
        System.out.print("quantity:" + mquantity);
        System.out.print("price:" + mprice);
    }
}
        class Purchase extends Details{
            String bname;
            int bquantity;
            double total;
            int price;

            Purchase(String bname, int bquantity, int price) {
                super(bname,bquantity,price); // only passing price to base class
                this.bname = bname;
                this.bquantity = bquantity;
               // this.total=total;
                this.price=price;
            }
            void cal(){
                total=mprice*bquantity;
            }
            void pdisplay(){
                cal();
                System.out.print("name:" + bname);
                System.out.print("quantity:" + bquantity);
                System.out.print("price:" + mprice);
                System.out.print("total:" + total);
            }
}
class Nandhu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        String name= sc.next();
        System.out.print("Enter product quantity ");
        int mquntity= sc.nextInt();
        System.out.print("Enter the product price: ");
        int mprice= sc.nextInt();
        System.out.print("Enter buyer name ");
        String bname= sc.next();
        System.out.print("Enter the buyer quantity: ");
        int bquantity= sc.nextInt();

        Details obj =new Details(name,mquntity,mprice);
        obj.display();
        Purchase obj1 = new Purchase(bname,bquantity,mprice);
        obj1.cal();
        obj1.pdisplay();
    }
}
