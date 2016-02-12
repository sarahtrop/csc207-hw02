import java.awt.*;
import java.io.IOException;

public class SpeedReader {

	public static void main(String[] args) throws InterruptedException, IOException { // Not sure why this needs to be here, but Eclipse wanted it there.

		// If not enough arguments, quit
		if (args.length != 5) {
			System.out.println("Error: not enough arguments entered.");
			return;
		}

		// setting variables from input
		String filename = args[0]; 
		int width = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);
		int fontSize = Integer.parseInt(args[3]);
		int wpm = Integer.parseInt(args[4]);

		WordGenerator file = new WordGenerator(filename);

		// Making a panel in which to display words
		DrawingPanel display = new DrawingPanel(width, height); 
		Graphics g = display.getGraphics();
		Font f = new Font("Courier", Font.BOLD, fontSize);
		g.setFont(f);
		Color white = new Color(255, 255, 255);
		Color black = new Color(0, 0, 0);
		
		while(file.hasNext()) {
			//Printing words on display
			g.drawString(file.next(), (width/2), (height/2));
			Thread.sleep(wpm*1000/60);
			g.setColor(white);
			g.fillRect(0, 0, width, height);
			g.setColor(black);
		}
		
		//Counting words and sentences
		file.getWordCount();
		file.getSentenceCount();

		System.out.println("Number of words in file: " + file.words);
		System.out.println("Number of sentences in file: " + file.sentences);
	}
}