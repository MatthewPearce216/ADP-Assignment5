package ac.za.cput;

public class Vehicle {

    public void drive(){
        System.out.println("I can Drive");
    }

    public void seats(){
        System.out.println("The seats are NORMAL");
    }

    public String driverDetails(){
        return new Driver("matthew", "pearce", 50, "b").toString();
    }

    public void printVehicle(){
        drive();
        seats();
        System.out.println(driverDetails());
        System.out.println();
    }
}
