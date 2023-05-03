package mods;

import ConsoleRenderer;

public class StringText {

	public static void CoordinateString(int X, int Y, String string) {
		String[] list = string.split("");
		int i = 0;
		for(String s : list) {
			ConsoleRenderer.Coordinate(X + i, Y, s);
			i++;
		}
		
	}
}
