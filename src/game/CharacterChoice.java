package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class CharacterChoice {
	public Rectangle FishButton = new Rectangle(Main.frameWidth/4,Main.frameHeight/2,Main.frameWidth/7,Main.frameHeight/10);
	public Rectangle CrabButton = new Rectangle(2*Main.frameWidth/4,Main.frameHeight/2,Main.frameWidth/7,Main.frameHeight/10);
	public Rectangle BirdButton = new Rectangle(3*Main.frameWidth/4,Main.frameHeight/2,Main.frameWidth/7,Main.frameHeight/10);
	
	public void render(Graphics g) {
		Font font = new Font("arial", Font.BOLD,Main.frameHeight/10);
		Font font1 = new Font("arial", Font.BOLD,Main.frameHeight/12);
		g.setFont(font);
		g.setColor(Color.black);
		g.drawString("Choose your character", Main.frameWidth/4, Main.frameHeight/5);
		g.setFont(font1);
		g.drawString("Fish", FishButton.x+Main.frameWidth/36, FishButton.y+Main.frameHeight/16);
		g.drawString("Crab", CrabButton.x+Main.frameWidth/36, CrabButton.y+Main.frameHeight/16);
		g.drawString("Bird", BirdButton.x+Main.frameWidth/36, BirdButton.y+Main.frameHeight/16);
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(FishButton);
		g2d.draw(CrabButton);
		g2d.draw(BirdButton);
	}
}
