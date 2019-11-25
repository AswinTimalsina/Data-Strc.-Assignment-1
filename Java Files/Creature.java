/**
Date:        09/13/2018
Course:      CSCI 2073 - 40416
Description: This program is the super abstract class. It has two subclasses namely Plip.java and Croon.java.
             The program has two constructors, setter, getter, abstract move method and toString method.
             On my honor, I have neither given nor received unauthorized help while completing this assignment.
Name:        Aswin Timalsina
CWID:        30098693
*/


//initialised instance variables 
public abstract class Creature{
   private double strength;
   private int lifeUnits;
   private int x;
   private int y;


//constructor to initialise values specially for Croon.java
   public Creature(double strength, int x, int y){
      this.strength = strength;
      this.x = x;
      this.y = y;
   }


//constructor to initialise values specially for Plip.java
   public Creature(int lifeUnits, int x, int y){
      this.lifeUnits = lifeUnits;
      this.x = x;
      this.y = y;
   }


/**
   returns the value of x
   @return x the value of x
*/
   public int getX(){
      return x;
   }


/**
   sets the value of x
   @param x the value of x
*/
   public void setX(int x){
      this.x = x;
   }


/**
   returns the value of y
   @return y the value of y
*/
   public int getY(){
      return y;
   }


/**
   sets the value of y
   @param y the value of y
*/
   public void setY(int y){
      this.y = y;
   }


/**
   abstract method to move
*/
   public abstract void move();


/**
   returns the value of x
   @return x the value of x
*/
   public String toString(){
      return 
      "\n==================="+
      "\n|X:          |" + getX() + "|" +
      "\n===================" +
      "\n|Y:          |" + getY() + "|";
   }


}