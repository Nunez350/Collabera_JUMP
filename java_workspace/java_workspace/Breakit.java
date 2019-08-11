/*This is an example of using a break statement in a while loop*/

public class Breakit {
   public static void main(String args[]){
      int num =1;
      while(num<11){
          System.out.println("variable = "+num);
          if (num==5){
             break;
             /*once the specified condition is true in if statement we enter 
             and execute all the commands that preceedd the break statement. 
             Once we reach the break statement
             we instantly exit the while loop*/
          }
          num++;
      }
      //this is executed since it is out of the while loop
      System.out.println('\n'+"Broke out of while loop");
  }
}