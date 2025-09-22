import java.util.Scanner;

// Base Class
class Employee {
    String empName, empId, address, mailId, mobileNo;
    double basicPay;

    Employee(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    void display() {
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee ID : " + empId);
        System.out.println("Address : " + address);
        System.out.println("Mail ID : " + mailId);
        System.out.println("Mobile No : " + mobileNo);
        System.out.println("Basic Pay : " + basicPay);
    }
}

// Derived Classes for each designation
class Programmer extends Employee {
    Programmer(String n, String id, String a, String m, String mob, double bp) {
        super(n, id, a, m, mob, bp);
    }

    void generatePaySlip() {
        double DA = 0.97 * basicPay;
        double HRA = 0.10 * basicPay;
        double PF = 0.12 * basicPay;
        double SC = 0.01 * basicPay;
        double gross = basicPay + DA + HRA;
        double net = gross - PF - SC;

        System.out.println("\n--- Programmer Pay Slip ---");
        display();
        System.out.println("DA : " + DA);
        System.out.println("HRA : " + HRA);
        System.out.println("PF : " + PF);
        System.out.println("Staff Club : " + SC);
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net Salary : " + net);
    }
}

class AssistantProfessor extends Employee {
    AssistantProfessor(String n, String id, String a, String m, String mob, double bp) {
        super(n, id, a, m, mob, bp);
    }

    void generatePaySlip() {
        double DA = 1.10 * basicPay;
        double HRA = 0.20 * basicPay;
        double PF = 0.12 * basicPay;
        double SC = 0.10 * basicPay;
        double gross = basicPay + DA + HRA;
        double net = gross - PF - SC;

        System.out.println("\n--- Assistant Professor Pay Slip ---");
        display();
        System.out.println("DA : " + DA);
        System.out.println("HRA : " + HRA);
        System.out.println("PF : " + PF);
        System.out.println("Staff Club : " + SC);
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net Salary : " + net);
    }
}

class AssociateProfessor extends Employee {
    AssociateProfessor(String n, String id, String a, String m, String mob, double bp) {
        super(n, id, a, m, mob, bp);
    }

    void generatePaySlip() {
        double DA = 1.30 * basicPay;
        double HRA = 0.30 * basicPay;
        double PF = 0.12 * basicPay;
        double SC = 0.10 * basicPay;
        double gross = basicPay + DA + HRA;
        double net = gross - PF - SC;

        System.out.println("\n--- Associate Professor Pay Slip ---");
        display();
        System.out.println("DA : " + DA);
        System.out.println("HRA : " + HRA);
        System.out.println("PF : " + PF);
        System.out.println("Staff Club : " + SC);
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net Salary : " + net);
    }
}

class Professor extends Employee {
    Professor(String n, String id, String a, String m, String mob, double bp) {
        super(n, id, a, m, mob, bp);
    }

    void generatePaySlip() {
        double DA = 1.40 * basicPay;
        double HRA = 0.40 * basicPay;
        double PF = 0.12 * basicPay;
        double SC = 0.15 * basicPay;
        double gross = basicPay + DA + HRA;
        double net = gross - PF - SC;

        System.out.println("\n--- Professor Pay Slip ---");
        display();
        System.out.println("DA : " + DA);
        System.out.println("HRA : " + HRA);
        System.out.println("PF : " + PF);
        System.out.println("Staff Club : " + SC);
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net Salary : " + net);
    }
}

// Main Class
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Emp ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Address: ");
        String addr = sc.nextLine();
        System.out.print("Enter Mail ID: ");
        String mail = sc.nextLine();
        System.out.print("Enter Mobile No: ");
        String mob = sc.nextLine();
        System.out.print("Enter Basic Pay: ");
        double bp = sc.nextDouble();
        if(bp<15000)
        {
             System.out.println("Invalid basic pay"); 
             return;
        }
        else if(bp>=15000 || bp<=20000)
        {
                Programmer p = new Programmer(name, id, addr, mail, mob, bp);
                p.generatePaySlip();
        }        
        else if(bp>=20001 || bp<=30000)
        {   
                AssistantProfessor ap = new AssistantProfessor(name, id, addr, mail, mob, bp);
                ap.generatePaySlip();
        }
        else if(bp>=30001 || bp<=40000)
        {
                AssociateProfessor asp = new AssociateProfessor(name, id, addr, mail, mob, bp);
                asp.generatePaySlip();
        }
        else if(bp>=40000)
        {
                Professor prof = new Professor(name, id, addr, mail, mob, bp);
                prof.generatePaySlip();
        }
        else{
                System.out.println("Invalid Choice!");
        }
        sc.close();
    }
  }

