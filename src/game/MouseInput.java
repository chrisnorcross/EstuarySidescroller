package game;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	//public Rectangle PlayButton = new Rectangle(Board.frameWidth/4+120,150,100,50);
	//public Rectangle HelpButton = new Rectangle(Board.frameWidth/4+120,250,100,50);
	//public Rectangle QuitButton = new Rectangle(Board.frameWidth/4+120,350,100,50);

	@Override
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		if(Board.STATE == "Menu") {
		if (mx >=Board.frameWidth/4+120 && mx <= Board.frameWidth/4+220) {
			if(my >= 150 && my <= 200) {
				Board.STATE = "Game";
			}
		}
		}
		if (Board.STATE == "Over") {
			if (mx >=Board.frameWidth/4 && mx <= Board.frameWidth/4+100) {
				if(my >= 350 && my <= 400) {
					Board.STATE = "Menu";
					Board.reset();
				}
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
