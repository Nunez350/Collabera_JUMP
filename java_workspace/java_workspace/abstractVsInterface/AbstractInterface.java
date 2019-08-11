

//example of an abstract class using an abstract method
abstract class Car{  
  abstract void run();  
}  



class Honda extends Car{  
    void run(){
        System.out.println("running safely");
    }  

    
    public static void main(String args[]){  
    Car obj = new Honda();  
    obj.run();  
    }  
}  