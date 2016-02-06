import java.util.Scanner;

public class SpeedReader {

	//EXAMPLE USAGE
	public void demonstratePanel() {
	    DrawingPanel panel = new DrawingPanel(400, 300);
	    Graphics g = panel.getGraphics();
	    Font f = new Font("Courier", Font.BOLD, 46);
	    g.setFont(f);
	    g.drawString("Hello World!", 100, 100);
	}
	
	//EXAMPLE USAGE
	public void printStaggered() throws InterruptedException {
	    while(true) {
	        System.out.println("Hello World!");
	        Thread.sleep(1000);
	    }
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String filename, width, height, fontSize, wpm;
		
		filename = in.next();
		width = in.next();
		height = in.next();
		fontSize = in.next();
		wpm = in.next();
		int i;
		String[] numericalInput = new String[4];
		numericalInput[0] = width;
		numericalInput[1] = height;
		numericalInput[2] = fontSize;
		numericalInput[3] = wpm;
		

		in.close();
	}

}
