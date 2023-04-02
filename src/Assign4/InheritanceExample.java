// Design and develop inheritance for a given case study and identify objects and relationships in it.
// Employee class with Emp_name, Emp_id, Address, Mail_id, and Mobile_no as data members. Inherit the
// classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class. Add
// Basic Pay (BP) as the member of all the inherited classes with 97% of BP, DA 10 % of BP, HRA is12% of
// BP, and PF is 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net
// salary.

package Assign4;
import java.util.*;

public class InheritanceExample {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int ch=1;
        do{
            System.out.println("\n");
            System.out.println("Enter the Name for Programmer");
            String s=scan.next();
            System.out.println("Enter the id for Programmer");
            int id=scan.nextInt();
            System.out.println("Enter the address for Programmer");
            String address=scan.next();
            System.out.println("Enter the mail for Programmer");
            String mail =scan.next();
            System.out.println("Enter the mobile for Programmer");
            String mobile=scan.next();
            System.out.println("Enter the Basic Pay for Programmer");
            int n=scan.nextInt();
            Programmer p1=new Programmer(s, id,address, mail, mobile, n);



            System.out.println("\n");
            System.out.println("Enter the Name for Assistant Professor");
            String s1=scan.next();
            System.out.println("Enter the id for Assistant Professor");
            int id1=scan.nextInt();
            System.out.println("Enter the address for Assistant Professor");
            String address1=scan.next();
            System.out.println("Enter the mail for Assistant Professor");
            String mail1 =scan.next();
            System.out.println("Enter the mobile for Assistant Professor");
            String mobile1=scan.next();
            System.out.println("Enter the Basic Pay for Assistant Professor");
            int n1=scan.nextInt();
            AssistantProfessor p2=new AssistantProfessor(s1, id1,address1, mail1, mobile1, n1);



            System.out.println("\n");
            System.out.println("Enter the Name for Associate Professor");
            String s2=scan.next();
            System.out.println("Enter the id for Associate Professor");
            int id2=scan.nextInt();
            System.out.println("Enter the address for Associate Professor");
            String address2=scan.next();
            System.out.println("Enter the mail for Associate Professor");
            String mail2 =scan.next();
            System.out.println("Enter the mobile for Associate Professor");
            String mobile2=scan.next();
            System.out.println("Enter the Basic Pay for Associate Professor");
            int n2=scan.nextInt();
            AssociateProfessor p3=new AssociateProfessor(s2, id2,address2, mail2, mobile2, n2);

            System.out.println("\n");
            System.out.println("Enter the Name for Professor");
            String s3=scan.next();
            System.out.println("Enter the id for Professor");
            int id3=scan.nextInt();
            System.out.println("Enter the address for Professor");
            String address3=scan.next();
            System.out.println("Enter the mail for Professor");
            String mail3 =scan.next();
            System.out.println("Enter the mobile for Professor");
            String mobile3=scan.next();
            System.out.println("Enter the Basic Pay for Professor");
            int n3=scan.nextInt();
            Professor p4=new Professor(s3, id3,address3, mail3, mobile3, n3);
            
            
            System.out.println("\n");
            System.out.println("The Information on slip for Programmer");
            System.out.println("///////////////////////////////////\n");
            p1.displayInfo(s, id, address, mail, mobile, n);
            p1.grossSalary();
            p1.netSalary();
            System.out.println("///////////////////////////////////\n");

            System.out.println("\n");
            System.out.println("The Information on slip for Assistant Professor");
            System.out.println("///////////////////////////////////\n");
            p2.displayInfo(s1, id1, address1, mail1, mobile1, n1);
            p2.grossSalary();
            p2.netSalary();
            System.out.println("///////////////////////////////////\n");

            System.out.println("\n");
            System.out.println("The Information on slip for Associate Professor");
            System.out.println("///////////////////////////////////\n");
            p3.displayInfo(s2, id2, address2, mail2, mobile2, n2);
            p3.grossSalary();
            p3.netSalary();
            System.out.println("///////////////////////////////////\n");

            System.out.println("\n");
            System.out.println("The Information on slip for Professor");
            System.out.println("///////////////////////////////////\n");
            p4.displayInfo(s3, id3, address3, mail3, mobile3, n3);
            p4.grossSalary();
            p4.netSalary();
            System.out.println("///////////////////////////////////\n");


            System.out.println("Do you want to continue 1:Yes 2:NO");
            ch = scan.nextInt();

        }while(ch==1);
        scan.close();
    }
}

class Employee{
    protected String Emp_name;
    protected int Emp_id;
    protected String Address;
    protected String Mail_id;
    protected String Mobile_no;
    Employee(){

    }
    Employee(String name,int id,String address,String Mail,String Mobile){
        Emp_name = name;
        Emp_id = id;
        Address = address;
        Mail_id = Mail;
        Mobile_no = Mobile;
    }
}

class Programmer extends Employee{
    protected double Basic_pay;
    public Programmer(String name,int id,String address,String Mail,String Mobile, double bp) {
        super(name, id, address, Mail, Mobile);
        Basic_pay = bp;
    }
    public void grossSalary() {
        double DA = Basic_pay * 0.1;
        double HRA = Basic_pay * 0.12;
        double gp=Basic_pay + DA + HRA;
        System.out.println("The Gross Salary of this Programmer is : " + gp);
    }

    public void netSalary() {
        double PF = Basic_pay * 0.001;
        double DA = Basic_pay * 0.1;
        double HRA = Basic_pay * 0.12;
        double gp=Basic_pay + DA + HRA;
        double NS=gp- PF;
        System.out.println("The Net Salary of this Programmer is : " +NS);
    }
    public void displayInfo(String name,int id,String address,String Mail,String Mobile, double bp){
        System.out.println("The name of Programmer is : " + name );
        System.out.println("The ID of Programmer is " + id);
        System.out.println("The Address of Programmer is : " + address);
        System.out.println("The Mail of Programmer is " + Mail);
        System.out.println("The Mobile number of Programmer is : " + Mobile);
        System.out.println("The  Baisc pay is : " + bp);
    }
}

class  AssistantProfessor extends Employee{
    protected double Basic_pay;
    public AssistantProfessor(String name,int id,String address,String Mail,String Mobile, double bp) {
        super(name, id, address, Mail, Mobile);
        Basic_pay = bp;
    }
    public void grossSalary() {
        double DA = Basic_pay * 0.1;
        double HRA = Basic_pay * 0.12;
        double gp=Basic_pay + DA + HRA;
        System.out.println("The Gross Salary of this Assistance Professor is : " + gp);
    }

    public void netSalary() {
        double PF = Basic_pay * 0.001;
        double DA = Basic_pay * 0.1;
        double HRA = Basic_pay * 0.12;
        double gp=Basic_pay + DA + HRA;
        double NS=gp- PF;
        System.out.println("The Net Salary of this Assistance Professor is : " +NS);    
    }
    public void displayInfo(String name,int id,String address,String Mail,String Mobile, double bp){
        System.out.println("The name of AssistantProfessor is : " + name);
        System.out.println("The ID of AssistantProfessor is " + id);
        System.out.println("The Address of AssistantProfessor is : " + address);
        System.out.println("The Mail of AssistantProfessor is " + Mail);
        System.out.println("The Mobile number of AssistantProfessor is : " + Mobile);
        System.out.println("The  Baisc pay is : " + bp);
    }
}

class AssociateProfessor extends Employee{
    protected double Basic_pay;
    public AssociateProfessor(String name,int id,String address,String Mail,String Mobile, double bp) {
        super(name, id, address, Mail, Mobile);
        Basic_pay = bp;
    }
    public void grossSalary() {
        double DA = Basic_pay * 0.1;
        double HRA = Basic_pay * 0.12;
        double gp=Basic_pay + DA + HRA;
        System.out.println("The Gross Salary of this Associate Professor is : " + gp);    
    }

    public void netSalary() {
        double PF = Basic_pay * 0.001;
        double DA = Basic_pay * 0.1;
        double HRA = Basic_pay * 0.12;
        double gp=Basic_pay + DA + HRA;
        double NS=gp- PF;
        System.out.println("The Net Salary of this Associate Professor is : " +NS);    
    }
    public void displayInfo(String name,int id,String address,String Mail,String Mobile, double bp){
        System.out.println("The name of AssociateProfessor is : " + name);
        System.out.println("The ID of AssociateProfessor is " + id);
        System.out.println("The Address of AssociateProfessor is : " + address);
        System.out.println("The Mail of AssociateProfessor is " + Mail);
        System.out.println("The Mobile number of AssociateProfessor is : " + Mobile);
        System.out.println("The  Baisc pay is : " + bp);
    }
}

class Professor extends Employee{
    protected double Basic_pay;
    public Professor(String name,int id,String address,String Mail,String Mobile, double bp) {
        super(name, id, address, Mail, Mobile);
        Basic_pay = bp;
    }
    public void grossSalary() {
        double DA = Basic_pay * 0.1;
        double HRA = Basic_pay * 0.12;
        double gp=Basic_pay + DA + HRA;
        System.out.println("The Gross Salary of this Professor is : " + gp);    
    }

    public void netSalary() {
        double PF = Basic_pay * 0.001;
        double DA = Basic_pay * 0.1;
        double HRA = Basic_pay * 0.12;
        double gp=Basic_pay + DA + HRA;
        double NS=gp- PF;
        System.out.println("The Net Salary of this Professor is : " +NS);    
    }
    public void displayInfo(String name,int id,String address,String Mail,String Mobile, double bp){
        System.out.println("The name of Professor is : " + name);
        System.out.println("The ID of Professor is " + id);
        System.out.println("The Address of Professor is : " + address);
        System.out.println("The Mail of Professor is " + Mail);
        System.out.println("The Mobile number of Professor is : " + Mobile);
        System.out.println("The  Baisc pay is : " + bp);
    }
}