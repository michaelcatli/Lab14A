// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
  String shapeName;
  int numSides;
  public Shape1Square(){
    shapeName = "Square";numSides = 4;
  }
   public void drawShape(Graphics g)
   {
     g.fillRect(50,50,100,100);
   }
   public void displayName(Graphics g){
     g.drawString("This is a " + shapeName + ".",50,180);
   }
   public void displayNumSides(Graphics g){
     g.drawString("This has " + numSides + " sides.",50,170);
   }
}
