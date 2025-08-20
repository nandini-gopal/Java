import java.util.Scanner;
class Company {
    String name;
    int age;
    String gender;
    int id;

    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your gender: ");
        gender = sc.next();
        System.out.print("Enter your ID: ");
        id = sc.nextInt();
    }

    void details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("ID: " + id);
    }

}
class HR extends Company {
    String dep;
    double salary;

    void hr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        dep = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void hrdetails() {
        details();
        System.out.println("Department: " + dep);
        System.out.println("Salary: " + salary);
    }
}

class Finance extends Company {
    String dep;
    double salary;

    void fina() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        dep = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void findetails() {
        details();
        System.out.println("Department: " + dep);
        System.out.println("Salary: " + salary);
    }
}

class Technical extends Company {
    String dep;
    double salary;

    void tec() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        dep = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void tedetails() {
        details();
        System.out.println("Department: " + dep);
        System.out.println("Salary: " + salary);
    }
}

class Operation extends Company {
    String dep;
    double salary;

    void ope() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        dep = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void opdetails() {
        details();
        System.out.println("Department: " + dep);
        System.out.println("Salary: " + salary);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Department:");
        System.out.println("1. HR\n2. Finance\n3. Technical\n4. Operation");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                HR hrEmp = new HR();
                hrEmp.display();
                hrEmp.hr();
                hrEmp.hrdetails();
                break;
            case 2:
                Finance finEmp = new Finance();
                finEmp.display();
                finEmp.fina();
                finEmp.findetails();
                break;
            case 3:
                Technical techEmp = new Technical();
                techEmp.display();
                techEmp.tec();
                techEmp.tedetails();
                break;
            case 4:
                Operation opEmp = new Operation();
                opEmp.display();
                opEmp.ope();
                opEmp.opdetails();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
