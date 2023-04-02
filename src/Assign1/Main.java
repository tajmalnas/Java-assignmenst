package Assign1;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int l=1;
        do{
            System.out.println("enter real part of first num :");
            int r1 = scan.nextInt();
            System.out.println("enter img part of first num :");
            int img1=scan.nextInt();
            Complex c1 = new Complex(r1,img1);

            System.out.println("enter real part of second num :");
            int r2 = scan.nextInt();
            System.out.println("enter img part of second num :");
            int img2=scan.nextInt();
            Complex c2 = new Complex(r2,img2);

            Complex c3 = new Complex();
            Complex c4 = new Complex();
            Complex c5 = new Complex();
            Complex c6 = new Complex();

            int k=0;
            System.out.println("Enter k:");
            k=scan.nextInt();
            if(k==1){
                c3.add(c1, c2);
            }
            if(k==2){
                c4.sub(c1, c2);
            }
            if(k==3){
                c5.mul(c1, c2);
            }
            if(k==4){
                c6.div(c1, c2);
            }

            System.out.println("Do you Want to continue : 1:YES and 0:NO");
            l=scan.nextInt();
        }while(l==1);
        scan.close();
    }
}

class Complex{
    Complex(){

    };
    int real;
    int imag;
    Complex(int a, int b){
        this.real=a;
        this.imag=b;
    }
    void add(Complex c1,Complex c2){
        int real=(c1.real+c2.real);
        int img=(c1.imag+c2.imag);
        System.out.println("The addition of complex number are : " +real+" + "+img+"i");
    }
    void sub(Complex c1,Complex c2){
        int real=(c1.real-c2.real);
        int img=(c1.imag-c2.imag);
        System.out.println("The Subtraction of complex number are : " +real+" - "+img+"i");
    }
    void mul(Complex c1,Complex c2){
        int real=(c1.real*c2.real)-(c1.imag*c2.imag);
        int img=(c1.real*c2.imag)+(c2.real*c1.imag);
        System.out.println("The Multiplication of complex number are : " +real+" + "+img+"i");
    }
    void div(Complex c1,Complex c2){
        double real=((c1.real*c2.real)+(c1.imag*c2.imag))/(c2.imag*c2.imag + c2.real*c2.real);
        double img=((c1.imag*c2.real)+(c1.real*c2.imag))/(c2.imag*c2.imag + c2.real*c2.real);
        System.out.println("The addition of complex number are : " +real+" + "+img+"i");
    }
}
