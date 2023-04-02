// Design a class named weather report that holds a daily weather report with data members day_of_month,
// hightemp, lowtemp, amount_rain and amount_snow. Use different types of constructors to initialize the
// objects. Write a program to generate monthly report that displays average of each attribute

package Assign2;
import java.util.*;

public class Weather {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of days");
        int n=scan.nextInt();
        int nn=n;
        WeatherReport[] arr;
        arr = new WeatherReport[n];
        int i=0;
        while(n>0){
            System.out.println("Enter the day");
            String day=scan.next();
            int hightemp, lowtemp, amount_rain , amount_snow;
            System.out.println("Enter the High Temperature of that Day");
            hightemp=scan.nextInt();
            System.out.println("Enter the Low Temperature of that Day");
            lowtemp=scan.nextInt();
            System.out.println("Enter the Amount of Rain of that Day");
            amount_rain=scan.nextInt();
            System.out.println("Enter the Amount of Snow of that Day");
            amount_snow=scan.nextInt();
            arr[i]=new WeatherReport(day,hightemp,lowtemp,amount_rain,amount_snow);
            i++;
            n--;
        }
        int ch=1;
        WeatherReport w =new WeatherReport();
        do{
            int x=0;
            System.out.println("/ / / / / / / / / / / / / / / / / / /");
            System.out.println("1 : Information of that Day");
            System.out.println("2 : Average of Low Temperaure");
            System.out.println("3 : The average of High_Temperatur");
            System.out.println("4 : The average of Amount Of Rain");
            System.out.println("5 : The average of Amount Of Snow");
            System.out.println("/ / / / / / / / / / / / / / / / / / /");

            System.out.println("Enter your Choice");
            x=scan.nextInt();
            if(x==1){
                int num;
                System.out.println("Enter num of day for Info of That day");
                num =scan.nextInt();
                arr[num-1].displayData();
            }
            if(x==2){
                w.Average_LowTemp(nn,arr);
            }
            if(x==3){
                w.Average_HighTemp(nn,arr);
            }
            if(x==4){
                w.Average_Amount_of_Rain(nn,arr);
            }
            if(x==5){
                w.Average_Amount_of_Snow(nn,arr);
            }
            System.out.println("Do you Want to Continue : 1:Yes Or 0:No");
            ch=scan.nextInt();
        }while(ch==1);
        System.out.println("Thanks for executing programming");
        scan.close();
    }
}
class WeatherReport{
    String day;
    int hightemp, lowtemp, amount_rain , amount_snow;
    WeatherReport(){

    }
    public void displayData(){
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("The Day is : "+this.day);
        System.out.println("The hightemp is : "+this.hightemp);
        System.out.println("The lowtemp is : "+this.lowtemp);
        System.out.println("The amount_rain is : "+this.amount_rain);
        System.out.println("The amount_snow is : "+this.amount_snow);
        System.out.println("* * * * * * * * * * * * * *");
    }

    public void Average_LowTemp(int nn,WeatherReport arr[]){
        double avg=0;
        for(int i=0;i<nn;i++){
            avg=avg+arr[i].lowtemp;
        }
        avg=avg/nn;
        System.out.println("The average of Low_Temperatur of all days "+avg);
    }

    public void Average_HighTemp(int nn,WeatherReport arr[]){
        double avg=0;
        for(int i=0;i<nn;i++){
            avg=avg+arr[i].hightemp;
        }
        avg=avg/nn;
        System.out.println("The average of High_Temperatur of all days "+avg);
    }

    public void Average_Amount_of_Rain(int nn,WeatherReport arr[]){
        double avg=0;
        for(int i=0;i<nn;i++){
            avg=avg+arr[i].amount_rain;
        }
        avg=avg/nn;
        System.out.println("The average of Amount Of Rain of all days "+avg);
    }

    public void Average_Amount_of_Snow(int nn,WeatherReport arr[]){
        double avg=0;
        for(int i=0;i<nn;i++){
            avg=avg+arr[i].amount_snow;
            System.out.println("The average of Amount of Snow of all days "+avg);
        }
        avg=avg/nn;
    }

    WeatherReport(String s,int a,int b,int c,int d){
        this.day=s;
        this.hightemp=a;
        this.lowtemp=b;
        this.amount_rain=c;
        this.amount_snow=d;
    }

}
