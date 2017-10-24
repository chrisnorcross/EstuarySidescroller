import java.awt.Color;
import java.awt.Component;
import java.awt.image.ImageObserver;

import javax.swing.*;
public class Controller {
	public static void main(String[] args) {
		Board board = new Board();
		View view = new  View();
		JFrame frame = new JFrame();
		frame.getContentPane().add(view);
    	frame.setBackground(Color.gray);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
	}
}
