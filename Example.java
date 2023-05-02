package main;

import renderer.ConsoleRenderer;

public class Example {

	public static void main(String[] args) {
		// Instances The Console Renderer Class
		ConsoleRenderer cr = new ConsoleRenderer();
		
		// Sets Screen Size to: WIDTH = 6, HEIGHT = 3;
		cr.Screen_Setup(6, 3);
		
		// Makes a Smiley Face in ACII
		cr.Coordinate(3, 1, "|");
		cr.Coordinate(5, 1, "|");
		cr.Coordinate(4, 2, "^");
		cr.Coordinate(2, 3, "\\");
		cr.Coordinate(3, 3, "_");
		cr.Coordinate(4, 3, "_");
		cr.Coordinate(5, 3, "_");
		cr.Coordinate(6, 3, "/");
		
		// Renders The Coordinates
		cr.Render();
	}

}
