package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * @author ericallen
 * Creates menu page with 3 buttons to start the game, go to tutorial and quit
 * once clicked with the mouse input it directs to that location. Menu drawn in paint
 */
public class Menu {
	
	public Rectangle PlayButton = new Rectangle(Main.frameWidth/2, 3*Main.frameHeight/12,Main.frameWidth/7,Main.frameHeight/10);
	public Rectangle HelpButton = new Rectangle(Main.frameWidth/2, 5*Main.frameHeight/12,Main.frameWidth/7,Main.frameHeight/10);
	public Rectangle QuitButton = new Rectangle(Main.frameWidth/2, 7*Main.frameHeight/12,Main.frameWidth/7,Main.frameHeight/10);

		/**
		 * Renders the menu to view
		 * @param g
		 */
		public void render(Graphics g) {

			Font font = new Font("arial", Font.BOLD,Main.frameHeight/10);
			Font font1 = new Font("arial", Font.BOLD,Main.frameHeight/12);
			g.setFont(font);
			g.setColor(Color.black);
			g.drawString("Estuary Adventure", Main.frameWidth/3, Main.frameHeight/5);
			g.setFont(font1);
			g.drawString("Play",PlayButton.x+Main.frameWidth/36,PlayButton.y+Main.frameHeight/14);
			g.drawString("Help",HelpButton.x+Main.frameWidth/36,HelpButton.y+Main.frameHeight/14);
			g.drawString("Quit",QuitButton.x+Main.frameWidth/36,QuitButton.y+Main.frameHeight/14);
			Graphics2D g2d = (Graphics2D) g;
			g2d.draw(PlayButton);
			g2d.draw(HelpButton);
			g2d.draw(QuitButton);
		}
}
