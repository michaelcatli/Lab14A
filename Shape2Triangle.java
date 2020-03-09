// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
  String shapeName;
  int numSides;
  public Shape2Triangle(){
    shapeName = "Triangle";numSides=3;
  }
   public void drawShape(Graphics g)
   {
     Polygon triangle = new Polygon();
     triangle.addPoint(450,50);triangle.addPoint(500,50);triangle.addPoint(450,100);
     g.fillPolygon(triangle);
   }
   public void displayName(Graphics g){
     g.drawString("This is a " + shapeName + ".",450,120);
   }
   public void displayNumSides(Graphics g){
     g.drawString("This has " + numSides + " sides.",450,130);
   }
}
