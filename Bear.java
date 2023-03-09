// This defines a simple class of critters that infect whenever they can and
// otherwise just spin around, looking for critters to infect.  This simple
// strategy turns out to be surpisingly successful.

import java.awt.*;

public class Bear extends Critter {
private boolean polar;
private boolean slash;

   
   public Bear(boolean polar) {
      this.polar = polar;
      this.slash = true;
   }

    
    public Action getMove(CritterInfo info) {
        this.slash = !slash;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT; //infects if runs into anything other than a bear
        } 
        
        else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP; //moving forward if there's nothing 
        }
        else {
            return Action.LEFT;//otherwise turns left
        }
    } // end getMove()

    //alternates between white and black
    public Color getColor() {
         if (polar) {
         return Color.WHITE;
        } else { return Color.BLACK; }
        } // end getColor()

    public String toString() {
    if(slash) { 
      return "/";
       } 
    else { return "\\"; 
      }
    } // end toString()
} // end class