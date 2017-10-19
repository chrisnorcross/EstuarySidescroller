
public class Player extends Character {
	int score=0;
	int health=10;
	int food=0;
	
	public Player() {
		xloc = Model.frameWidth-100;
		yloc = Model.frameHeight/2;
		lane=3;
	}
	public void JumpUp() {
		this.lane++;
	}
	public void JumpDown() {
		this.lane--;
	}
}
