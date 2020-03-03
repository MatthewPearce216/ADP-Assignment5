package ac.za.cput;

public class Main {

    public static void main(String[] args) {
        //Polymorphism
        Vehicle bus = new Bus();
        Vehicle car = new Car();

        bus.printVehicle();
        car.printVehicle();
    }

}
