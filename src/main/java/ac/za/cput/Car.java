package ac.za.cput;

public class Car extends Vehicle{
    //Inheriting from Vehicle
    @Override
    public void drive() {
        System.out.println("I am a fast driver");
    }
}
