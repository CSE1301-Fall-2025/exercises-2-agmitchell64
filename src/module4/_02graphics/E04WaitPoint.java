package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class E04WaitPoint {

	/*
	 * Exercise: Use the StdDraw API to complete the code one
	 * step at a time.
	 */
	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while(!StdDraw.isMousePressed()){
			StdDraw.pause(10);
		}

		// here, the mouse has been pressed
		while(StdDraw.isMousePressed()){
			StdDraw.pause(10);

		// here the mouse is released

	
		// draw a point at the location of the mouse
		double x = StdDraw.mouseX();
		double y = StdDraw.mouseY();
		StdDraw.setPenRadius(0.02); 
		StdDraw.show();
		// here, a q has been typed
		while (!StdDraw.hasNextKeyTyped()||StdDraw.nextKeyTyped() != 'q'){
			StdDraw.pause(10);

		}
		
		StdDraw.text(0.5, 0.5, "Farewell!");
		StdDraw.show();

	}

}
}
