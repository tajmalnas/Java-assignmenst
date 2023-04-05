// Identify commonalities and differences between Publication, Book and Magazine classes. Title, Price,
// Copies are common instance variables and saleCopy is common method. The differences are, Bookclass
// has author and order_Copies(). Magazine Class has orderQty, Current_issue() and receive_issue().Write a
// program to find how many copies of the given books are ordered and display the total sale of publication

//Name:tajjuddin malnas
//Roll:SYITB70
//Num :Assignment No.4
//Topic:Polymorphism

import java.util.*;
public class BookStore {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int ch=0;
        int b=0;
        int m=0;
        Book b1=new Book();
        Magazine m1=new Magazine();
        do{
            System.out.println("0:Exit\n");
            System.out.println("1:Books\n");
            System.out.println("2:Magazinesn\n");
            System.out.println("Enter your Choice\n");
            ch=scan.nextInt();
            if(ch==1){
                System.out.println("* * * * The Books Section are as follow * * * *\n");
                do{
                    System.out.println("0:Exit from Books Section\n");
                    System.out.println("1:Enter the details of Books\n");
                    System.out.println("2:Show the details of Books\n");
                    System.out.println("3:Sale some of Books\n");
                    System.out.println("4:Order the Books\n");
                    System.out.println("Enter your Choice\n");
                    b=scan.nextInt();
                    if(b==1){
                        b1.read_book();
                    }
                    if(b==2){
                        b1.bookDetail();
                    }
                    if(b==3){
                        int sale;
                        System.out.println("how many books you want to sell\n");
                        sale=scan.nextInt();
                        b1.saleBook(sale);
                    }
                    if(b==4){
                        int order;
                        System.out.println("how many books you want to order\n");
                        order=scan.nextInt();
                        b1.orderCopies(order);
                    }

                }while(b>0);
            }
            if(ch==2){
                System.out.println("* * * * The Magazines Section are as follow * * * *\n");
                do{
                    System.out.println("0:Exit from Magazine Section\n");
                    System.out.println("1:Enter the details of Magazine\n");
                    System.out.println("1:Show the details of Magazine\n");
                    System.out.println("2:Sale some of Magazine\n");
                    System.out.println("3:Order the Magazine\n");
                    System.out.println("Enter your Choice\n");
                    m=scan.nextInt();
                    if(m==1){
                        m1.readMagazine();
                    }
                    if(m==2){
                        m1.magazineDetails();
                    }
                    if(m==3){
                        int x;
                        System.out.println("Enter number of Books you want to Sell : \n");
                        x= scan.nextInt();
                        m1.saleCopy(x);
                    }
                    if(m==4){
                        System.out.println("Enter number of Books you want to Order : \n");
                        int x= scan.nextInt();
                        m1.recieveIssue(x);
                    }
                }while(m>0);
            }
        }while(ch>0);
    }
}

class Publication{
    Scanner scan =new Scanner(System.in);
    private String title;
    private int price;
    private int copies;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getCopies() {
        return copies;
    }
    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void read(){
        System.out.println("Enter Title of Book\n");
        title=scan.next();
        System.out.println("Enter Price of Book\n");
        price=scan.nextInt();
        System.out.println("Enter Copies of Book\n");
        copies=scan.nextInt();
    }
    public void readMag(){
        System.out.println("Enter Title of Magazine\n");
        title=scan.next();
        System.out.println("Enter Price of Magazine\n");
        price=scan.nextInt();
        System.out.println("Enter Copies of Magazine\n");
        copies=scan.nextInt();
    }

    public void displayBook(){
        System.out.println("The Book name is : "+title+" \n");
        System.out.println("The Book price is : "+price+" \n");
    }

    public void displayMagazine(){
        System.out.println("The Magazine name is : "+title+" \n");
        System.out.println("The Magazine price is : "+price+" \n");
    }

    public void saleCopy(int number){
        setCopies(copies-number);
        System.out.println("* * * * * * * * * * * * * * * * \n");
        System.out.println("Copies Remaining is : "+copies+"\n");
        System.out.println("* * * * * * * * * * * * * * * * \n");
    }

}

class Book extends Publication{
    Scanner scan =new Scanner(System.in);
    private String author;
    public void read_book(){
        read();
        System.out.println("Enter Author name : \n");
        author = scan.next();
    }
    public void bookDetail(){
        System.out.println("* * * * * * * * * * * * * * * * *");
        displayBook();
        System.out.println("Author name is : " + author +"\n");
        System.out.println("* * * * * * * * * * * * * * * * *");
    }
    public void saleBook(int number){
        saleCopy(number);
    }
    public void orderCopies(int number){
        setCopies(getCopies()+number);
        System.out.println("* * * * * * * * * * * * * * * * \n");
        System.out.println("The Numbers of Books : "+getCopies()+"\n");
        System.out.println("* * * * * * * * * * * * * * * * \n");
    }
}

class Magazine extends Publication{
    private int orderQuantity;
    private String currentIsssue;
    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public void readMagazine(){
        readMag();
        System.out.println("Enter Date of Issue of Magazine : \n");
        currentIsssue=scan.next();
    }

    public void magazineDetails(){
        System.out.println("* * * * * * * * * * * * * * * * *");
        displayMagazine();
        System.out.println("Date of Issue is : " + currentIsssue +"\n");
        System.out.println("* * * * * * * * * * * * * * * * *");
    }

    public void recieveIssue(int number){
        setOrderQuantity(number+getCopies());
        System.out.println("* * * * * * * * * * * * * * * * *");
        System.out.println("Total number of Magazines : "+getOrderQuantity()+"\n");
        System.out.println("* * * * * * * * * * * * * * * * *");
    }
}
