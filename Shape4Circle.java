// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
   public void drawShape(Graphics g)
   {
     g.fillOval(450,350,100,100);
   }
   public void displayName(Graphics g){
     g.drawString("This is a circle.", 450, 320);
   }
   public void displayNumSides(Graphics g){
     g.drawString("A circle has 0 sides.", 450, 330);
   }
}
