package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class CharacterChoice {
	public Rectangle FishButton = new Rectangle(Board.frameWidth/4,250,100,50);
	public Rectangle CrabButton = new Rectangle(Board.frameWidth/4+120,250,100,50);
	public Rectangle BirdButton = new Rectangle(Board.frameWidth/4+240,250,100,50);
	
	public void render(Graphics g) {
		Font font = new Font("arial", Font.BOLD,50);
		Font font1 = new Font("arial", Font.BOLD,30);
		g.setFont(font);
		g.setColor(Color.black);
		g.drawString("Choose your character", Board.frameWidth/4, 100);
		g.setFont(font1);
		g.drawString("Fish", FishButton.x+19, FishButton.y+30);
		g.drawString("Crab", CrabButton.x+19, CrabButton.y+30);
		g.drawString("Bird", BirdButton.x+19, BirdButton.y+30);
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(FishButton);
		g2d.draw(CrabButton);
		g2d.draw(BirdButton);
	}
}
