import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordGenerator {
	
	public boolean hasNext() {
		return true;
	}
	
	public String next() {
		String nextToken = null;
		
		return nextToken;
	}
	
	public int getWordCount() {
		int words = 0;
		
		if (this.next() != null) {
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
		 Scanner text = new Scanner(new File(filename));
		 int words;
		 int sentences;
		 
		    while (text.hasNext()) {
		        // PROCESS TEXT HERE
		    	text.next();
		    	words = text.getWordCount();
		    	sentences = text.getSentenceCount();
		    }
		    
		    text.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
