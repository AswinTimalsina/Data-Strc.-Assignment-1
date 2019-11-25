/**
Date:        09/13/2018
Course:      CSCI 2073 - 40416
Description: The program is the subclass of the abstract creature class. The program has constructor, 
             methods like getLife(), move(), absorb(), toString().
             On my honor, I have neither given nor received unauthorized help while completing this assignment.
Name:        Aswin Timalsina
CWID:        30098693
*/


public class Plip extends Creature
{

//initialises the instance variables
   private int x;
   private int y;
   private int lifeUnits;
   private int eastFlag = 0;   //flag used


//constructor to initialise the arguments
   public Plip(int lifeUnits, int x, int y){
      super(lifeUnits, x , y);
      this.lifeUnits = lifeUnits;
      this.x = x;
      this.y = y;
   }


/**
   returns the value of life units of Plip
   @return lifeUnits the value of life units of Plip
*/
   public int getLife(){
      return lifeUnits;
   }


/**
   sets the lifeUnits argument with variable
   @param lifeUnits the life unit of Plip
*/
   public void setLife(int lifeUnits){
      this.lifeUnits = lifeUnits;
   }


/**
   abstract move method to move the Plip creature with its specialised properties and conditions
*/
   public void move(){
      if(getLife() >= 2 && (x >=0 && x<= 19)){
         lifeUnits -= 2;    
      
         if(eastFlag == 1 && x != 0){         //condition if the creature has touched the x = 19 and if it is not in x = 0
            x -= 1;                           //moves toward west
         
         }
         
         //If it touches west
         else if(eastFlag == 1 && x == 0){     //condition if the creature has touched the x = 19 and if it is in x = 0
            eastFlag = 0;
            x+=1;                              //moves toward east
         
         }
      
      //touches east
         if(eastFlag == 0 && x == 19 ){      //condition if the creature has just touched x = 19 
            eastFlag = 1;                    //flag to define that it has touched x = 19
            x -= 1;                          //moves toward west
         
         }
         
         else if(eastFlag == 0 && x >= 0){    //condition if the creature has not touched x = 19 and if x is atleast 0
            x+=1;                             //moves toward east
         }
         setX(x);                             //synchronizes the value of x with super class
      }
   }


/**
   method to increase the lifeunits as absorb method is called
*/
   public void absorb(){
      lifeUnits += 1;
   }



/**
   @Override
   returns the current values of diffferent variables
   @return String
*/
   public String toString(){
      return super.toString() + "\n==================="+
      
      
      "\n|Life units: |" + lifeUnits + "|\n===================\n\n" ;
   }




}//ends