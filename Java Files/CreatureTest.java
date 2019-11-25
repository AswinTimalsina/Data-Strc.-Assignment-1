/**
   Date:          September 2018
   Course:        CSCI 2073
   Description:   Program to test the basic functionality of the Creature class hierarchy
   Author:        Dr. Jose Cordova
*/
public class CreatureTest
{
   public static void main(String [] args)
   {
      Plip     p1 = new Plip  (50,  5,  5);
      Creature p2 = new Plip  (40, 19, 15);
      Croon    c1 = new Croon (.5, 10, 15);
      Creature c2 = new Croon (.3, 10, 19);
      
      System.out.println("Plip  1: " + p1.getLife() + " life units at (" + p1.getX() + "," + p1.getY() + ")");
      System.out.println("Croon 1: " + c1.getStrength() + " strength at (" + c1.getX() + "," + c1.getY() + ")");
            
      p2.move();
      c2.move();
      p1.move();
      c1.move();
      System.out.println("\nPlip  1: " + p1);
      System.out.println("Plip  2: " + p2);   
      System.out.println("Croon 1: " + c1);
      System.out.println("Croon 2: " + c2);
      System.out.println();
      
      Plip p3 = new Plip(10, 10, 11);
      p3.absorb();
      Plip p4 = new Plip(10, 10, 14);
      System.out.println(c1.preyOn(p3));
      System.out.println(c1.preyOn(p4));
      System.out.println("Plip  3: " + p3); 
      System.out.println("Plip  4: " + p4);   
      System.out.println("Croon 1: " + c1);
      System.out.println();
   }
}