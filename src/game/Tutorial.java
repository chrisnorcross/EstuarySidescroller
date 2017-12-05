package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

//FIXME: The drawstring with text need to be fixed to fit on the screen (and different size screens)
//XXX  Need to adjust the images for the final version keeping coordinates

public class Tutorial {
	public Rectangle menuButton = new Rectangle(5*Main.frameWidth/6,Main.frameHeight/4*3,Main.frameWidth/8,Main.frameHeight/12);
	public Rectangle characterButton = new Rectangle(4*Main.frameWidth/6,Main.frameHeight/4*3,Main.frameWidth/8,Main.frameHeight/12);
	public void render(Graphics g) {
		Font font = new Font("arial", Font.BOLD,Main.frameHeight/Main.frameHeight/25);
		Font font3 = new Font("arial", Font.BOLD,Main.frameHeight/20);
		Font font2 = new Font("calibri", Font.BOLD,Main.frameHeight/14);
		g.setFont(font);
		g.drawString("This is a Striped Bass. It grows big and strong by eating dead fish." , Main.frameWidth/4, Main.frameHeight/3 -50);
		g.setFont(font);
		g.drawString("*It gets weak if it eats any type of garbage like tires and trashbags.*" , Main.frameWidth/4, Main.frameHeight/3+Main.frameHeight/15-50);
		g.setFont(font);
		g.drawString("This is a Red Knot. It is a small bird that fattens up by eating horseshoe crab eggs." , Main.frameWidth/4, Main.frameHeight/2-50);
		g.setFont(font);
		g.drawString("*To stay big, avoid grass and clouds of pollution.*" , Main.frameWidth/4, Main.frameHeight/2+Main.frameHeight/15-50);
		g.setFont(font);
		g.drawString("This is a Horseshoe Crab. It grows big and strong by eating clams." , Main.frameWidth/4, Main.frameHeight/2+100);
		g.setFont(font);
		g.drawString("*It gets weak if it eats any type of garbage like tires and trashbags.*" , Main.frameWidth/4, Main.frameHeight/2+Main.frameHeight/15+100);
		g.setFont(font2);
		g.setColor(Color.black);
		g.drawString("HOW TO PLAY",2*Main.frameWidth/7, Main.frameHeight/7);
		g.setFont(font3);
		g.drawString("Menu",(int)Math.round(menuButton.x+menuButton.getWidth()/8),(int)Math.round(menuButton.y+5*menuButton.getHeight()/7));
		g.drawString("Play",(int)Math.round(characterButton.x+characterButton.getWidth()/8),(int)Math.round(characterButton.y+5*characterButton.getHeight()/7));
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(menuButton);
		g2d.draw(characterButton);

	}

}
