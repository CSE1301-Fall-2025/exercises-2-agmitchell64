package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class E01GraphicsDemo {

	/*
	 * Exercise: use the StdDraw API to draw the requested
	 * items below.
	 */
	public static void main(String[] args) {
		//Using a built-in color
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(0.5, 0.5, .2);
		
		//Using a custom color
		Color purply = new Color(255, 0, 150);
		
		//Use the StdDraw API to do the following:
		
		//Draw a blue point anywhere you like
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.5, 0.5, 0.02);
		
		//Draw a larger green point someplace else
			StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(0.75, 0.75, 0.05);

		//Draw an unfilled red triangle somewhere
		StdDraw.setPenColor(Color.RED);

		//since its a polygon you have to set cords for vertcies 
		double x1= 0.2;
		double y1 = 0.2 ;

		double x2= 0.8;
		double y2 = 0.2;

		double x3= 0.5;
		double y3 =0.7 ;

		//create array for cords 
		double[] xcords = {x1,x2,x3};
		double [] ycords = {y1,y2,y3};

		StdDraw.polygon(xcords, ycords);

		//Draw a filled yellow circle somewhere

		//Draw a filled blue rectangle somewhere

	}
}
