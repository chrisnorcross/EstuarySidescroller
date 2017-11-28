package game;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author ericallen Listener for mouse input
 */
public class MouseInput implements MouseListener {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 * Default
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 * Default
	 * 
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 * Default
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	// public Rectangle PlayButton = new
	// Rectangle(Board.frameWidth/4+120,150,100,50);
	// public Rectangle HelpButton = new
	// Rectangle(Board.frameWidth/4+120,250,100,50);
	// public Rectangle QuitButton = new
	// Rectangle(Board.frameWidth/4+120,350,100,50);

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 * Listens for mouse input and makes corrosponding move
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		if (Board.STATE == "Menu") {
			if (mx >= Board.frameWidth / 4 + 120 && mx <= Board.frameWidth / 4 + 220) {
				if (my >= 150 && my <= 200) {
					Board.STATE = "Game";
				}
			}
			if (mx >= Board.frameWidth / 4 + 120 && mx <= Board.frameWidth / 4 + 300) {
				if (my >= 200 && my <= 300) {
					Board.STATE = "Tutorial";
				}
			}
			if (mx >= Board.frameWidth / 4 + 120 && mx <= Board.frameWidth / 4 + 300) {
				if (my >= 300 && my <= 400) {
					System.exit(1);
				}
			}
		}
		if (Board.STATE == "Over") {
			if (mx >= Board.frameWidth / 4 && mx <= Board.frameWidth / 4 + 100) {
				if (my >= 350 && my <= 400) {
					Board.STATE = "Menu";
					Board.reset();
				}
			}
		}
		if (Board.STATE == "Tutorial") {
			if (mx >= Board.frameWidth / 4 && mx <= Board.frameWidth / 4 + 100) {
				if (my >= 350 && my <= 400) {
					Board.STATE = "Menu";
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 * default for when the click is disengaged
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
