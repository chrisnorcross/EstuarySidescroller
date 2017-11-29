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
	//hiscores	
	//public Rectangle MenuButton = new Rectangle(Main.frameWidth-Main.frameWidth/4,Main.frameHeight/2,Main.frameWidth/7,Main.frameHeight/10);
	//menu
	//public Rectangle PlayButton = new Rectangle(Main.frameWidth/2,Main.frameHeight/4,100,50);
	//public Rectangle HelpButton = new Rectangle(Main.frameWidth/2, Main.frameHeight/3,100,50);
	//public Rectangle QuitButton = new Rectangle(Main.frameWidth/2,Main.frameHeight/2,100,50);
	//tutorial
	//public Rectangle menuButton = new Rectangle(Main.frameWidth/2,Main.frameHeight/4*3,100,50);
	//characterchoice
	//public Rectangle FishButton = new Rectangle(Main.frameWidth/4,Main.frameHeight/2,100,50);
	//public Rectangle CrabButton = new Rectangle(2*Main.frameWidth/4,Main.frameHeight/2,100,50);
	//public Rectangle BirdButton = new Rectangle(3*Main.frameWidth/4,Main.frameHeight/2,100,50);

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
			if (mx >= Main.frameWidth / 2 && mx <= Main.frameWidth / 2 + Main.frameWidth/7) {
				if (my >= 3*Main.frameHeight/12 && my <= 3*Main.frameHeight/12+Main.frameHeight/10) {
					Board.STATE = "Character";
				}
			}
			if (mx >= Main.frameWidth / 2 && mx <= Main.frameWidth / 2 + Main.frameWidth/7) {
				if (my >= 5*Main.frameHeight/12 && my <= 5*Main.frameHeight/12+Main.frameHeight/10) {
					Board.STATE = "Tutorial";
				}
			}
			if (mx >= Main.frameWidth / 2 && mx <= Main.frameWidth / 2 + Main.frameWidth/7) {
				if (my >= 7*Main.frameHeight/12 && my <= 7*Main.frameHeight/12+Main.frameHeight/10) {
					System.exit(1);
				}
			}
		}
		if (Board.STATE == "Over") {
			if (mx >= Main.frameWidth-Main.frameWidth/4 && mx <= Main.frameWidth-Main.frameWidth/4+ Main.frameWidth/7) {
				if (my >= Main.frameHeight/2 && my <= Main.frameHeight/2+Main.frameHeight/10) {
					Board.STATE = "Menu";
					Board.reset();
				}
			}
		}
		if (Board.STATE == "Character") {
			if (mx >= Main.frameWidth / 4 && mx <= Main.frameWidth / 4 + 205) { // changed from 100 to 105 to fill buttom
				if (my >= Main.frameHeight/2 && my <= Main.frameHeight/2+90) { // changed from 50 to 90 to fill button
					Board.STATE = "GameFish";
				}
			}
			if (mx >= 2* Main.frameWidth / 4 && mx <= 2* Main.frameWidth / 4 + 205) { // changed from 100 to 105 to fill buttom
				if (my >= Main.frameHeight/2 && my <= Main.frameHeight/2+90) { // changed from 50 to 90 to fill button
					Board.STATE = "GameCrab";
				}
			}
			if (mx >= 3*Main.frameWidth / 4 && mx <= 3*Main.frameWidth / 4 + 205) { // changed from 100 to 105 to fill buttom
				if (my >= Main.frameHeight/2 && my <= Main.frameHeight/2+90) { // changed from 50 to 90 to fill button
					Board.STATE = "GameBird";
				}
			}
		}
		if (Board.STATE == "Tutorial") {
			if (mx >= Main.frameWidth/2 && mx <= Main.frameWidth/2 + 100) {
				if (my >= Main.frameHeight/4*3 && my <= Main.frameHeight/4*3+50) {
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
