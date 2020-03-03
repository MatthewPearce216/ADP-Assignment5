package ac.za.cput;

public class Bus extends Vehicle {
    //Inheriting from Vehicle
    @Override
    public void seats() {
        System.out.println("The seats are HARD");
    }
}