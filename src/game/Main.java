package game;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author ericallen
 * Main runs the application
 */
public class Main {
	public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int frameWidth;// = 500;
	public static int frameHeight;// = 300;
	
	public static void main(String[] args) {
		frameWidth =(int) screenSize.getWidth();
		frameHeight =(int) screenSize.getHeight();
		//frameHeight = frameHeight - 65; lowest height we want the fish to go on the macbook screen.
		// however it messes with the food.. Person can just ride the bottom like and not take damage

		Board board = new Board();
		HighScorePage hiscores = new HighScorePage();
		View view = new View(frameWidth,frameHeight, board.getObstacles(), board.getPlayer(),board, hiscores);
		Controller controller = new Controller(board,view);
		view.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//public static Dimension screenSize = Toolkit.getDefaultToolkit().sync();

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
