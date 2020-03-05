// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape
{
   public void drawShape(Graphics g)
   {
     Polygon octagon = new Polygon();
     octagon.addPoint(45,350);octagon.addPoint(75,350);octagon.addPoint(105,380);octagon.addPoint(105,410);
     octagon.addPoint(75,440);octagon.addPoint(45,440);octagon.addPoint(15,410);octagon.addPoint(15,380);
     g.fillPolygon(octagon);
   }
   public void displayName(Graphics g){
     g.drawString("This is an octagon.", 30,325);
   }
   public void displayNumSides(Graphics g){
     g.drawString("This has 8 sides.", 30, 450);
   }
}
