public class Abstraction {
    public static void main(String[] args) {
        
    }
}

class Audi extends Car{

}
class BMW extends Car{

}

abstract class Car{
    String brand;
    int price;

    void start(){
        System.out.println("car is starting");
    }
}