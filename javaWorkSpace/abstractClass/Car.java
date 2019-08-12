public class Car extends Vehicle {
 
    private int _doors;
    
    public Car(String color, String model, int doors) {
        super(color, model);
        this._doors = doors;
    }
 
    @Override
    void drive() {
        System.out.println("Car is in drive mode");
    }
 
    @Override
    void stop() {
        System.out.println("Car is in stop mode");
    }
 
    @Override
    void park() {
        System.out.println("Car is in park mode");
    }
}