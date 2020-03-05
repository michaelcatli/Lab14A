// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
   public void drawShape(Graphics g)
   {
     g.fillRect(50,50,100,100);
   }
   public void displayName(Graphics g){
     g.drawString("This is a square.",50,125);
   }
   public void displayNumSides(Graphics g){
     g.drawString("This has 4 sides.",50,155);
   }
}
