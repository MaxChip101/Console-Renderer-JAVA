package main;

import renderer.ConsoleRenderer;

public class Main {

	public static void main(String[] args) {
		ConsoleRenderer cr = new ConsoleRenderer();
		
		cr.Screen_Setup(64, 6);
		
		cr.Coordinate(3, 1, "|");
		cr.Coordinate(5, 1, "|");
		cr.Coordinate(4, 2, "^");
		cr.Coordinate(2, 3, "\\");
		cr.Coordinate(3, 3, "_");
		cr.Coordinate(4, 3, "_");
		cr.Coordinate(5, 3, "_");
		cr.Coordinate(6, 3, "/");
		
		cr.Render();
	}

}
