package game;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author ericallen
 * Main runs the application
 */
public class Main {
	public final static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int frameWidth = 500;
	public static int frameHeight = 300;
	
	public static void main(String[] args) {
		frameWidth =(int) screenSize.getWidth();
		frameHeight =(int) screenSize.getHeight();
		Board board = new Board();
		HighScorePage hiscores = new HighScorePage();
		View view = new View(frameWidth,frameHeight, board.getObstacles(), board.getPlayer(),board, hiscores);
		Controller controller = new Controller(board,view);
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
