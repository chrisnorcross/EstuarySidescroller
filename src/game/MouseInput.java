package game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author ericallen Listener for mouse input, adjustable to various screen sizes
 */

public class MouseInput implements MouseListener {

	/*
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	/*
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	/*
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	/*
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		if (Board.STATE == "Menu") {
			if (mx >= 3*Main.frameWidth/7 && mx <= 3*Main.frameWidth/7 + Main.frameWidth/8) {
				if (my >= 3*Main.frameHeight/12 && my <= 3*Main.frameHeight/12+Main.frameHeight/10) {
					Board.STATE = "Character";
				}
			}
			if (mx >= 3*Main.frameWidth/7 && mx <= 3*Main.frameWidth/7 + Main.frameWidth/8) {
				if (my >= 5*Main.frameHeight/12 && my <= 5*Main.frameHeight/12+Main.frameHeight/10) {
					Board.STATE = "Tutorial";
				}
			}
			if (mx >= 3*Main.frameWidth/7 && mx <= 3*Main.frameWidth/7 + Main.frameWidth/8) {
				if (my >= 7*Main.frameHeight/12 && my <= 7*Main.frameHeight/12+Main.frameHeight/10) {
					System.exit(1);
				}
			}
		}
		if (Board.STATE == "Over") {
			if (mx >= 4*Main.frameWidth/6 && mx <= 4*Main.frameWidth/6+ Main.frameWidth/6) {
				if (my >= Main.frameHeight/4*3 && my <= Main.frameHeight/4*3+Main.frameHeight/10) {
					Board.STATE = "Menu";
					Board.reset();
				}
			}
		}

		if (Board.STATE == "Character") {
			if (mx >= Main.frameWidth / 4 && mx <= Main.frameWidth / 4 + Main.frameWidth/7) { 
				if (my >= Main.frameHeight/2 && my <= Main.frameHeight/2+Main.frameHeight/8) { 
					Board.STATE = "GameFish";
				}
			}
			if (mx >= 2* Main.frameWidth / 4 && mx <= 2* Main.frameWidth / 4 + Main.frameWidth/7) {
				if (my >= Main.frameHeight/2 && my <= Main.frameHeight/2+Main.frameHeight/8) { 
					Board.STATE = "GameCrab";
				}
			}
			if (mx >= 3*Main.frameWidth / 4 && mx <= 3*Main.frameWidth / 4 + Main.frameWidth/7) { 
				if (my >= Main.frameHeight/2 && my <= Main.frameHeight/2+Main.frameHeight/8) { 
					Board.STATE = "GameBird";
				}
			}
			if (mx >= 4*Main.frameWidth/5 && mx <= 4*Main.frameWidth/5 + Main.frameWidth/7) {
				if (my >= Main.frameHeight/4*3 && my <= Main.frameHeight/4*3+Main.frameHeight/8) {
					Board.STATE = "Menu";
				}
			}
		}
		if (Board.STATE == "Tutorial") {
			if (mx >= 5*Main.frameWidth/6 && mx <= 5*Main.frameWidth/6 + Main.frameWidth/8) {
				if (my >= Main.frameHeight/4*3 && my <= Main.frameHeight/4*3+Main.frameHeight/12) {
					Board.STATE = "Menu";
				}
			}

			if (mx >= 4*Main.frameWidth/6 && mx <= 4*Main.frameWidth/6 + Main.frameWidth/8) {
				if (my >= Main.frameHeight/4*3 && my <= Main.frameHeight/4*3+Main.frameHeight/12) {
					Board.STATE = "Character";
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 * default for when the click is disengaged
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
