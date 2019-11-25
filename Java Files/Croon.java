/**
Date:        09/13/2018
Course:      CSCI 2073 - 40416
Description: The program is the subclass of the abstract creature class. The program has constructor, 
             methods like getStrength(), move(), preyOn() absorb(), toString().
             On my honor, I have neither given nor received unauthorized help while completing this assignment.
Name:        Aswin Timalsina
CWID:        30098693

*/


public class Croon extends Creature
{

//initialises the instance variables
   private int x;
   private int y;
   private int northFlag = 0;  //flag used
   private double strength;


//constructor to initialise the arguments
   public Croon(double strength, int x, int y){
      super(strength, x, y);
      this.strength = strength;
      this.x = x;
      this.y = y;
   }

/**
   returns the value of strength of Croon
   @return strength the value of strength of Croon
*/
   public double getStrength(){
      return strength;
   }


/**
   sets the object of type Plip
   returns the value as boolean
   @param lifeUnits the life unit of Plip
   @return boolean
*/
   public boolean preyOn(Plip a){
      if (a.getX() == x && a.getY() == y && a.getLife() >= 1){
         strength *= 2;
         a.setLife(0);
         return true;
      }
      return false;
   }


/**
   abstract move method to move the Croon creature with its specialised properties and conditions
*/
   public void move(){
   
      if(strength >= .25 && (y >=0 && y<= 19)){        //passes through only when the strength level is atleast .25 and y is in between 0 and 19
         strength -= strength *.05;                     //as it passes, strength level is decreased by 5%
      
         if(northFlag == 1 && y != 19){                //condition if the creature has touched the y = 0 and if it is not in y = 19
            y += 1;                                    //moves toward south
         }
         
         
         else if(northFlag == 1 && y == 19){           //condition if the creature has touched the y = 0 and if it is in y = 19
            northFlag = 0;
            y-=1;                                      //moves toward north
         }
      
      
         if(northFlag == 0 && y == 0 ){                //condition if the creature has just touched y = 0 line
            northFlag = 1;                             //flag to define that it has touched y = 0
            y += 1;                                    //moves toward south
         }
            
         else if(northFlag == 0 && y <= 19){           //condition if the creature has not touched y = 0 and if y is less than 19
            y -= 1;                                    //moves toward north
         
         }
         setY(y);
      }
   }



/**
   @Override
   returns the current values of diffferent variables
   @return String
*/
   public String toString(){
      return super.toString() + "\n==================="+
      "\n|Strength:   |" + strength + "|\n" + "===================" ;
   }


} //ends