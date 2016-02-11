import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordGenerator {
	
	public static Scanner text;
	public static String filename;
	public static int words, sentences;
	public static WordGenerator file;
		
	public static boolean hasNext() {
		return text.hasNext();
	}
	
	public static String next() {
		if (text.next() != null) { return text.next(); }
		else { return null; }
	}
		
	public static int getWordCount() {
		int words = 0;
		if (next() != null) { words++; }
		return words;
	}
	
	public static int getSentenceCount() {
		int sentences = 0;
		if (next().contains(".") || next().contains("!") || next().contains("?")) {
			sentences++;
		}
			
		return sentences;
	}
	
	public WordGenerator (String filename) throws IOException, InterruptedException {
		text = new Scanner(new File(filename));
			 
		    while (hasNext()) {
		    	next();
		    	words = getWordCount();
		    	sentences = getSentenceCount();
		    }
		text.close();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		file = new WordGenerator(filename);
	}
}