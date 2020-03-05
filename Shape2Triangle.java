// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{

   public void drawShape(Graphics g)
   {
     Polygon triangle = new Polygon();
     triangle.addPoint(450,50);triangle.addPoint(500,50);triangle.addPoint(450,100);
     g.fillPolygon(triangle);
   }
   public void displayName(Graphics g){
     g.drawString("This is a triangle.",450,100);
   }
   public void displayNumSides(Graphics g){
     g.drawString("This has 3 sides.",450,130);
   }
}
