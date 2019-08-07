/*
  BreakContinue

  The code below represents an example of;

  1. break statement in while-loop
  2. continue statement in while-loop
  3. break statemtn in for-loop
  4. continue statement in for-loop
  
  Roy Nunez 
*/



public class BreakContinue {
   public static void main(String args[]){

  //1. Break statement in a while-loop
    System.out.println("This is an example of using a break statement in a while-loop");
      int num1 =1;
      while(num1<11){
          System.out.println("variable = "+num1);
          if (num1==5){
             break;
             /*once the specified condition is true in if statement we enter 
             and execute all the commands that preceedd the break statement. 
             Once we reach the break statement
             we instantly exit the while loop*/
          }
          num1++;
      }
      //this is executed since it is out of the while loop
      System.out.println("Broke out of while-loop (Break Example)"+'\n');

  //2. Continue statement in while-loop
  System.out.println("This is an example of using a continue statement inside a while-loop");
     int num2 = 1;
     while (num2 < 11) {
        if (num2 == 5) {
            System.out.println( "Midpoint at " + num2 );
            num2++;
           continue;      
      /*will not execute the rest of the while loop.
        Control will return to beginning of while loop for next iteration   */
        }
      /*Once if-statement condition is reached, this iteration
       will not print or increment until next iteration*/
      System.out.println("variable = " + num2);
        num2++;
     
    }
    System.out.println("Out of while-loop (Continue example)"+'\n');

  //3. Break statement in for-loop
    System.out.println("This is an example of a break statement in a for-loop ");
    for ( int num =1 ; num <11; num++){
      if( num ==5 ){
          System.out.println("out on = "+ num+'\n');
          break;
          /*once the specified condition is true in if statement we enter 
             and execute all the commands that preceedd the break statement. 
             Once we reach the break statement
             we instantly exit the  for-loop*/
      }
      System.out.println("variable = "+ num);
    }

  //4. Continue statement in a for-loop
    System.out.println("This is an example of a continue statement in a for-loop ");
    for(int num =1; num <11; num++){
     if(num==5){
        System.out.println("Midpoint at "+num);
        continue;
        /*will not execute the rest of the for-loop.
      Control will return to beginning of for-loop for next iteration */
      }
      System.out.println("variable = "+num);
    /*Once if statment condition is reached, this iteration
     will not print or increment until next iteration*/
    }
  }
}





