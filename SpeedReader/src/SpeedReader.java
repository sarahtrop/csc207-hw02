import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class SpeedReader {

	public static int wpm;
	
	public static void main(String[] args) throws InterruptedException, IOException { // Not sure why this needs to be here, but Eclipse wanted it there.
		
		// If not enough arguments, quit
		if (args.length != 5) {
			System.out.println("Error: not enough arguments entered.");
			return;
		}
		
		// setting variables from input
		WordGenerator.filename = args[0]; 
		int width = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);
		int fontSize = Integer.parseInt(args[3]);
		wpm = Integer.parseInt(args[4]);
		
		while(WordGenerator.file.hasNext()) {
			// Making a panel in which to display words
			DrawingPanel display = new DrawingPanel(width, height); 
			Graphics g = display.getGraphics();
			Font f = new Font("Courier", Font.BOLD, fontSize);
			g.setFont(f);
			
			//Printing words on display
			g.drawString(WordGenerator.file.next(), (width/2), (height/2));
			Thread.sleep(wpm*60*1000);
		}
		
		System.out.println("Number of words in file: " + WordGenerator.words);
		System.out.println("Number of sentences in file: " + WordGenerator.sentences);
	}

}
