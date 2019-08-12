public abstract class Vehicle {
    private String _transmission;
    private String _condition;
    private Integer _price;
    
    Vehicle(String transmission, String condition, String accelaration){
        this._transmission= transmission;
        this._condition=condition;
        this._price=price;
    }

    abstract void drive();
    abstract void stop();

    void horn(){
        System.out.println("Beep Beep");
   } 

}