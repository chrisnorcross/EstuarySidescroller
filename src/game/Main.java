package game;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author ericallen
 * Main runs the application
 */

//XXX READ THIS
/**
 * NOTE FOR FULLSCREEN VS PARTIAL SCREEN
 * If doing anything other than full screen make sure the values for frameWidth and frameHeights
 * EXAMPLE:
 * 	public static int frameWidth;// = 700; //delete the = 700
 *  public static int frameHeight;// = 500; //delete the = 500
 *  ALSO COMMENT OUT THE screenSize.getHeight/Width
 *  
 *  
 *  If you are doing partial screen make sure you  
 *  make sure you have the frameHeight and Width commented out in the main
 *  also comment out the view.setExtendedState(JFrame.MAXIMIZED_BOTH);
 *  AND assign the frameHeight/Width a value above the main
 * 
 * @author ericallen
 */


// For JUnit tests frameWidth/Height are not declared until runtime. How do we test with no values. 
// I just set the value without the final... verify that it resets with frameWidth/height correctly on your computer 

public class Main {
	public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int frameWidth = 1440;// = 700; //delete unless partial screen// keep for testing
	public static int frameHeight=900;// = 500; //delete unless partial screen// keep for testing
	
	public static void main(String[] args) {
		frameWidth =(int) screenSize.getWidth();
		frameHeight =(int) screenSize.getHeight();
		//FIXME frameHeight = frameHeight - 65; lowest height we want the fish to go on the macbook screen.
		//FIXME however it messes with the food.. Person can just ride the bottom like and not take damage
		Board board = new Board();
		HighScorePage hiscores = new HighScorePage();
		View view = new View(frameWidth,frameHeight, board.getObstacles(), board.getPlayer(),board, hiscores);
		Controller controller = new Controller(board,view);
		
		//COMMENT OUT, IF NOT USING FULL SCREEN
		//view.setUndecorated(true);
		view.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		while (true) {
			controller.tick();
			controller.updateView();
			/*System.out.println(board.player);
			for (NPC n : board.getObstacles()) {
				System.out.println(n);
			}*/
			try {
				Thread.sleep(18);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
