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
		words++;
		String next_word = text.next();
		if (next_word.endsWith(".") || next_word.endsWith("?") || next_word.endsWith("!")) {
			sentences++;
		}
		return next_word;
	}
		
	public int getWordCount() {
		return words;
	}
	
	public int getSentenceCount() {
		return sentences;
	}
	
	public WordGenerator (String filename) throws IOException, InterruptedException {
		text = new Scanner(new File(filename));
	}
}