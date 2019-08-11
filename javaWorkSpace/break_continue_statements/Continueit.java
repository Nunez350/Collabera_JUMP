/*This is an example of using a continue statement inside a while loop*/

public class Continueit {
    public static void main(String args[]) {
        int num = 1;
        while (num < 11) {
            System.out.println("check = " + num);
            if (num == 5) {
                System.out.println( "Midpoint at " + num );
                num++;
                continue;      
            /*will not execute the rest of the while loop.
              Control will return to beginning of while loop for next iteration   */
            }
            /*Once if statment condition is reached, this iteration
             will not print or increment until next iteration*/
            System.out.println("variable = " + num);
            num++;
        }
        //this will execute once the while loop is done executing
        System.out.println("Out of while loop");
    }
}