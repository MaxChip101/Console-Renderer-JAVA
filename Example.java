import mods.StringText;

public class Example {

	public static void main(String[] args) {
		
		// Sets up the Console Renderer Screen Size to: WIDTH = 6, HEIGHT = 3;
		ConsoleRenderer.Screen_Setup(64, 64);
		
		// Makes a Smiley Face in ACII
		ConsoleRenderer.Coordinate(3, 1, "|");
		ConsoleRenderer.Coordinate(5, 1, "|");
		ConsoleRenderer.Coordinate(4, 2, "^");
		ConsoleRenderer.Coordinate(2, 3, "\\");
		ConsoleRenderer.Coordinate(3, 3, "_");
		ConsoleRenderer.Coordinate(4, 3, "_");
		ConsoleRenderer.Coordinate(5, 3, "_");
		ConsoleRenderer.Coordinate(6, 3, "/");
		
		// Uses the StringText mod for the ConsoleRenderer to render a string
		StringText.CoordinateString(0, 0, "Hello World");
		
		// Renders The Coordinates
		ConsoleRenderer.Render();
	}

}
