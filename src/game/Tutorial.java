package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Tutorial {
	public Rectangle menuButton = new Rectangle(Board.frameWidth/4,350,100,50);
	
	public void render(Graphics g) {
		Font font = new Font("arial", Font.BOLD,15);
		Font font2 = new Font("calibri", Font.BOLD,40);
		g.setFont(font);
		g.drawString("This is a Striped Bass. It grows big and strong by eating dead fish." , 160, 160);
		g.setFont(font);
		g.drawString("*It gets weak if it eats any type of garbage like tires and trashbags.*" , 160, 183);
		g.setFont(font);
		g.drawString("This is a Red Knot. It is a small bird that fattens up by eating horseshoe crab eggs." , 120, 260);
		g.setFont(font);
		g.drawString("*To stay big, avoid grass and clouds of pollution.*" , 200, 290);
		g.setFont(font2);
		g.setColor(Color.black);
		g.drawString("HOW TO PLAY",230, 70);
		g.setFont(font);
		g.drawString("Menu",menuButton.x+19,menuButton.y+30);
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(menuButton);
	}

}
