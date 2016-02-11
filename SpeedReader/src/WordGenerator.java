import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordGenerator {
	
	public Scanner text;
	public String filename;
	public int words = 0;
	public int sentences = 0;
		
	public boolean hasNext() {
		return text.hasNext();
	}
	
	public String next() {
		return text.next();
	}
		
	public int getWordCount() {
		if (next() != null) { words++; }
		return words;
	}
	
	public int getSentenceCount() {
		if (next().contains(".") || next().contains("!") || next().contains("?")) {
			sentences++;
		}
			
		return sentences;
	}
	
	public WordGenerator (String filename) throws IOException, InterruptedException {
		text = new Scanner(new File(filename));
	}
}