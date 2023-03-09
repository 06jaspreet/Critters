// This defines a simple class of critters that infect whenever they can and
// otherwise just spin around, looking for critters to infect.  This simple
// strategy turns out to be surpisingly successful.

import java.awt.*;
import java.util.*; // imports util. library for random color generator

public class Lion extends Critter {
private int colorCounter;

   //constructor method
   public Lion() {
      this.colorCounter = 0;
      
   }

     
    
    public Action getMove(CritterInfo info) {
    
        if (colorCounter % 3 == 0) { //color changes after 3 steps takes
            getColor();
        
        }
      
        if (info.getFront() == Neighbor.OTHER) {   
           return Action.INFECT; //infects if runs into anything other than a bear
           
           } else if (info.getFront () == Neighbor.SAME)  {
              return Action.RIGHT;
           
                      
            }else if (info.getFront () == Neighbor.WALL || info.getRight () == Neighbor.WALL) {
              return Action.LEFT;//otherwise turns left
        
              } else {
                   colorCounter++;
                   return Action.HOP; //moving forward

        
        
        }
    } // end getMove()
    

    //alternates between white and black
    public Color getColor() {
      Random rand = new Random();
      int number = rand.nextInt(3) + 1;//
     
         if (number == 1) {
            return Color.BLUE;
         
         } else if (number == 2) {
            return Color.RED;
         
         } else {
            return Color.GREEN;
         
         }
         
        
        
    } // end getColor()

    public String toString() {
    
      return "L";
      
      } // end toString()
      
} // end class