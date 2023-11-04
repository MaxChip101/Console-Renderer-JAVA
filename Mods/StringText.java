package mods;

import ConsoleRenderer;

public class StringText {

	public static void CoordinateString(int X, int Y, String string) {
		String[] list = string.split("");
		for(int i = 0; i < list.length; i++) {
			ConsoleRenderer.Coordinate(X + i, Y, list[i]);
		}
		
	}
}
