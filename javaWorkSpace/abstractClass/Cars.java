public class Car extends Vehicle {
    public Car( String transmission, String condition, Integer price){

        
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