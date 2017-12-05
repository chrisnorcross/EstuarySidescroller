package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TutorialGame implements KeyListener{
	Player player = new Player();
	NPC garbage = new Garbage();
	NPC food = new Food();
	NPC powerup = new PowerUp();
	
	
	TutorialGame(){}
	

	@Override
	public void keyPressed(KeyEvent key) {
		int keyCode = key.getKeyCode();
		if (KeyEvent.VK_UP == keyCode)
			player.accelUp();
		if (KeyEvent.VK_DOWN == keyCode)
			player.accelDown();		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (KeyEvent.VK_UP == keyCode)
			player.stop();
		if (KeyEvent.VK_DOWN == keyCode)
			player.stop();
		System.out.println("Player has stopped moving");
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
