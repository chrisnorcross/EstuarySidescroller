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
	
	public Rectangle PlayButton = new Rectangle(Board.frameWidth/4+120,150,100,50);
	public Rectangle HelpButton = new Rectangle(Board.frameWidth/4+120,250,100,50);
	public Rectangle QuitButton = new Rectangle(Board.frameWidth/4+120,350,100,50);

		/**
		 * Renders the menu to view
		 * @param g
		 */
		public void render(Graphics g) {

			Font font = new Font("arial", Font.BOLD,50);
			Font font1 = new Font("arial", Font.BOLD,30);
			g.setFont(font);
			g.setColor(Color.black);
			g.drawString("Estuary Adventure", Board.frameWidth/4, 100);
			g.setFont(font1);
			g.drawString("Play",PlayButton.x+19,PlayButton.y+30);
			g.drawString("Help",HelpButton.x+19,HelpButton.y+30);
			g.drawString("Quit",QuitButton.x+19,QuitButton.y+30);
			Graphics2D g2d = (Graphics2D) g;
			g2d.draw(PlayButton);
			g2d.draw(HelpButton);
			g2d.draw(QuitButton);
		}
}
