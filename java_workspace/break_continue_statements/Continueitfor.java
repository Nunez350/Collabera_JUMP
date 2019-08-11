

public class Continueitfor{
    public static void main(String args[]){
        for(int num =1; num <11; num++){
            if(num==5){
                System.out.println('\n'+"Midpoint at "+num+'\n');
                
                continue;
                /*will not execute the rest of the for loop.
              Control will return to beginning of for loop for next iteration   */
            }
            System.out.println("variable = "+num);
            /*Once if statment condition is reached, this iteration
             will not print or increment until next iteration*/
        }
       
    }

}