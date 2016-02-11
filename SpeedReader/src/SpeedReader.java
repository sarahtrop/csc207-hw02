import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class SpeedReader {
	public static int wpm;

	
	public static void main(String[] args) throws InterruptedException, IOException { // Not sure why this needs to be here, but Eclipse wanted it there.
		Scanner in = new Scanner(System.in);
		
		// setting variables from input
		WordGenerator.filename = in.next();
		int width = Integer.parseInt(in.next());
		int height = Integer.parseInt(in.next());
		int fontSize = Integer.parseInt(in.next());
		wpm = Integer.parseInt(in.nextLine());
		
		// Making a panel in which to display words
		DrawingPanel display = new DrawingPanel(width, height); 
		Graphics g = display.getGraphics();
		Font f = new Font("Courier", Font.BOLD, fontSize);
		g.setFont(f);

		int x = 1000;
		int y = (height/2) + (fontSize/2);
		
		while(WordGenerator.file.hasNext()){
			x = (width/2) - (WordGenerator.file.next().length() / 2);
			
			g.drawString(WordGenerator.file.next(), x, y);
		}
		
		in.close();
	}

}
