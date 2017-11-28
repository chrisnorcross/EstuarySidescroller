package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class HighScorePage {
	public Rectangle MenuButton = new Rectangle(Board.frameWidth/4,350,100,50);

	
	public void render(Graphics g) {
		Font font = new Font("arial", Font.BOLD,50);
		Font font1 = new Font("arial", Font.BOLD,30);
		g.setFont(font);
		g.setColor(Color.BLACK);
		g.drawString("Score: " + Player.score, Board.frameWidth/4, 100);
		g.setFont(font1);
		g.drawString("Menu", MenuButton.x+19, MenuButton.y+30);
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(MenuButton);
		g.setFont(new Font("arial",Font.ITALIC,20));
		int i = 0;
		for (int o =0;o<6;o++) {
			g.drawString((i+1) + ". "+ Board.scores.get(o), Board.frameWidth/4, 150+25*i);
		}
	}
}
