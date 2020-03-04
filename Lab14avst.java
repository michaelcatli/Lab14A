// Lab14avst.java
// Lab14a
// Student starting version


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14avst extends Applet
{
	public void paint(Graphics g)
	{
		drawGrid(g);
		ArrayList<Shape> dog = new ArrayList<Shape>();
		Shape square = new Shape1Square();
		Shape triangle = new Shape2Triangle();
		Shape octagon = new Shape3Octagon();
		Shape circle = new Shape4Circle();
		dog.add(square);
		dog.add(triangle);
		dog.add(octagon);
		dog.add(circle);
		//for (int x = 0; x<dog.size(); x++){
			//dog.get(x).drawShape();
			//dog.get(x).displayName();
			//dog.get(x).displayNumSides();
		}
   }

	public void drawGrid(Graphics g)
	{
    g.drawRect(10,10,800,600);
		g.drawLine(10,300,810,300);
		g.drawLine(410,10,410,610);
	}
}
