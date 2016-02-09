import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordGenerator {
	Scanner text;
	
	public boolean hasNext() {
		return text.hasNext();
	}
	
	public String next() {
		if (text.next()) { return text.next(); }
		else { return NULL; }
	}
	
	public int getWordCount() {
		int words = 0;
		if (next() != null) {
			words++;
		}
		return words;
	}
	
	public int getSentenceCount() {
		int sentences = 0;
		
		if (this.next().equals(".") || this.next().equals("!") || this.next().equals("?")) {
			sentences++;
		}
		
		return sentences;
	}
	
	public static void WordGenerator (String filename) throws IOException {
		 text = new Scanner(new File(filename));
		 int words;
		 int sentences;
		 
		    while (text.hasNext()) {
		        // PROCESS TEXT HERE
		    	next();
		    	words = getWordCount();
		    	sentences = getSentenceCount();
		    }
		    
		    text.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
