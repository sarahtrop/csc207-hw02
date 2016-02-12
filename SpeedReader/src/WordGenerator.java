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
		String nextWord = text.next();
		if (nextWord.endsWith(".") || nextWord.endsWith("?") || nextWord.endsWith("!")) {
			sentences++;
		}
		return nextWord;
	}

	public int getWordCount() {
		return words;
	}
	
	public int getSentenceCount() {
		return sentences;
	}
	
	public WordGenerator (String filename) throws IOException {
		text = new Scanner(new File(filename));
	}
}