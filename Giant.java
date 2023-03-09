// This defines a simple class of critters that infect whenever they can and
// otherwise just spin around, looking for critters to infect.  This simple
// strategy turns out to be surpisingly successful.

import java.awt.*;
import java.util.*; // imports util. library for random color generator

public class Giant extends Critter {

private int stepCounter;
private String name;

   //constructor method
   public Giant() {
      this.name = "Fee";
      this.stepCounter = 0;
      
   }

     
    
    public Action getMove(CritterInfo info) {
      
    
        if (stepCounter % 6 == 0) { //color changes after 3 steps takes
        
            switch (this.name){
            
            case ("Fee"):
                 this.name = "Fie";
                 toString();
                 break;
                 
            case ("Fie"):
                 this.name = "Foe";
                 toString();
                 break;
                 
            case ("Foe"):
                 this.name = "Fum";
                 toString();
                 break;
                 
            case ("Fum"):
                 this.name = "Fee";
                 toString();
                 break;
               
            
            }//end switch case
        
         
                      
         
        }
      
        if (info.getFront() == Neighbor.EMPTY) {   
           stepCounter++;
           return Action.HOP; //infects if runs into anything other than a bear
           
           } else if (info.getFront () == Neighbor.OTHER)  {
              return Action.INFECT;
         
              } else {
                   stepCounter++;
                   return Action.RIGHT; //moving forward

        
        
        }
    } // end getMove()
    

    //alternates between white and black
    public Color getColor() {
     // Random rand = new Random();
            return Color.GRAY;
         
    }
         
        
        
    
    public String toString() {
    
      return this.name;
      
      } // end toString()
      
 
} // end class
