// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
  String shapeName;
  int numSides;
  public Shape4Circle(){
    shapeName="Circle";numSides=0;
  }
   public void drawShape(Graphics g)
   {
     g.fillOval(450,350,100,100);
   }
   public void displayName(Graphics g){
     g.drawString("This is a " + shapeName + ".", 450, 320);
   }
   public void displayNumSides(Graphics g){
     g.drawString("This has " + numSides + " sides.", 450, 330);
   }
}
