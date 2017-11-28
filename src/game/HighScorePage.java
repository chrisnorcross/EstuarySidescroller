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
	public Rectangle MenuButton = new Rectangle(Main.frameWidth-Main.frameWidth/4,Main.frameHeight/2,Main.frameWidth/7,Main.frameHeight/10);

	
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
		g.drawString("Menu", MenuButton.x+Main.frameWidth/37, MenuButton.y+Main.frameHeight/17);
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(MenuButton);
		g.setFont(new Font("arial",Font.ITALIC,20));
		int i = 0;
		for (int o =0;o<5 ;o++) {
			g.drawString((i+1) + ". "+ Board.scores.get(o), Board.frameWidth/2, Main.frameHeight/3+Main.frameHeight/20*i);
			i++;
		}
	}
}
