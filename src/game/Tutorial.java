package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Tutorial {
	public Rectangle menuButton = new Rectangle(Main.frameWidth/2,Main.frameHeight/4*3,100,50);
	
	public void render(Graphics g) {
		Font font = new Font("arial", Font.BOLD,15);
		Font font2 = new Font("calibri", Font.BOLD,40);
		g.setFont(font);
		g.drawString("This is a Striped Bass. It grows big and strong by eating dead fish." , Main.frameWidth/4, Main.frameHeight/3);
		g.setFont(font);
		g.drawString("*It gets weak if it eats any type of garbage like tires and trashbags.*" , Main.frameWidth/4, Main.frameHeight/3+Main.frameHeight/15);
		g.setFont(font);
		g.drawString("This is a Red Knot. It is a small bird that fattens up by eating horseshoe crab eggs." , Main.frameWidth/4, Main.frameHeight/2);
		g.setFont(font);
		g.drawString("*To stay big, avoid grass and clouds of pollution.*" , Main.frameWidth/4, Main.frameHeight/2+Main.frameHeight/15);
		g.setFont(font2);
		g.setColor(Color.black);
		g.drawString("HOW TO PLAY",Main.frameWidth/2, Main.frameHeight/7);
		g.setFont(font);
		g.drawString("Menu",menuButton.x+19,menuButton.y+30);
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(menuButton);
	}

}
