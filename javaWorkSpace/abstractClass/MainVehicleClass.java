public class MainVehicleClass {
 
    public static void main(String[] args) {
       Car sportsCar = new Car("White","McLaren",2);
       sportsCar.drive();
       sportsCar.stop();
       sportsCar.park();
       sportsCar.horn();
       
       Ship speedBoat = new Ship("Green","Riva");
       speedBoat.drive();
       speedBoat.park();
       speedBoat.stop();
       speedBoat.horn();
    }
}