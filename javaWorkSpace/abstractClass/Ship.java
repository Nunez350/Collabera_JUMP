public class Ship extends Vehicle {
 
    public Ship(String color, String model) {
        super(color, model);
    }
 
    @Override
    void drive() {
        System.out.println("Ship is moving");
    }
 
    @Override
    void stop() {
        System.out.println("Ship is stopping");
    }
 
    @Override
    void park() {
        System.out.println("Ship is docking");
    }
    
}
