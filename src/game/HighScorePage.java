package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * @author ericallen
 * Creates high score page and menu button to start next round when ready
 * renders to the the display
 */
public class HighScorePage {
	public Rectangle MenuButton = new Rectangle(4*Main.frameWidth/6,Main.frameHeight/4*3,Main.frameWidth/6,Main.frameHeight/10);

	/**
	 * Method to display the high score page to paint
	 * @param g Graphics 
	 */
	public void render(Graphics g) {
		Font font = new Font("arial", Font.BOLD,Main.frameHeight/10);
		Font font1 = new Font("arial", Font.BOLD,Main.frameHeight/17);
		g.setFont(font);
		g.setColor(Color.BLACK);
		g.drawString("Score: " + Player.score, Main.frameWidth/4, Main.frameHeight/5);
		g.setFont(font1);
		g.drawString("Menu",(int)Math.round(MenuButton.x+MenuButton.getWidth()/8),(int)Math.round(MenuButton.y+5*MenuButton.getHeight()/7));
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(MenuButton);
		//XXX made it a little sexier and used consistent font (display stuff)
		g.setFont(new Font("arial",Font.ITALIC,Main.frameHeight/14));
		int i = 0;
		for (int o =0;o<5 ;o++) {
			g.drawString((i+1) + ". "+ Board.scores.get(o), Main.frameWidth/8, Main.frameHeight/3+Main.frameHeight/15*i);
			//XXX changed frameWidth/2 from Board to Main and remove variables from Board
			i++;
		}
	}
}
