import java.io.IOException;

public class ConsoleRenderer {
	
	private static int Screen_Width;
	private static int Screen_Height;
	private static int Screen_Total;
	public static String Screen_Pixels[];
	
	public static void Screen_Setup(int Width, int Height) {
		Screen_Width = Width + 1;
		Screen_Height = Height + 1;
		Screen_Total = Screen_Width * Screen_Height;
		Screen_Pixels = new String[Screen_Total];
		for(int i = 0; i <= Screen_Pixels.length; i++) {
			if(i != Screen_Total) {
				Screen_Pixels[i] = " ";
			}
		}
	}
	
	public static void Coordinate(int X, int Y, String Symbol) {
		if(Symbol.length() == 1) {
			int position;
			position = Y * Screen_Width + X;
			if(position > Screen_Total || Y > Screen_Height|| X > Screen_Width) {
				System.err.println("ILLEGAL POSITION ERROR AT: X=" + X + ", Y=" + Y + ", CHAR=" + Symbol + "; CHARACTER POSITION IS OUT OF BOUNDS");
				System.exit(10);
			}
			else {
				Screen_Pixels[position] = Symbol;
			}
		}
		else {
			System.err.println("ILLEGAL STRING AT: CHAR=" + Symbol + "; CHARACTER IS NOT A SINGLE CHARACTER");
			System.exit(10);
		}
	}
	
	public static void Render() {
		Clear_Console();
		int height_index = 0;
		for(int i = 0; i <= Screen_Pixels.length; i++) {
			if(i != Screen_Total) {
			System.out.print(Screen_Pixels[i]);
			}
			height_index++;
			if(height_index == Screen_Width) {
				height_index = 0;
				System.out.print("\n");
			}
			
		}
		
	}
	
	private static void Clear_Console() {
		try {
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
	    } catch (IOException | InterruptedException ex) {}
	}
	
}
