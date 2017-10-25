import java.util.ArrayList;

//chrisn
public class Player extends Character {
	int score=0;
	int health=10;
	int food=0;
	public ArrayList<String> collisions = new ArrayList<String>();
	
	public Player() {
		xloc = Model.frameWidth-350;
		yloc = Model.frameHeight/2;
		lane =3;
	}
	public void getHit() {
		this.health--;
	}
	
	public void eatFood() {
		this.food++;
	}
	
	public void JumpUp() {
		if (this.lane<5) {
			this.lane++;
		}
	}
	public void JumpDown() {
		if (this.lane>1) {
			this.lane--;
		}
	}
	public int getScore() {
		return this.score;
	}
	public void setScore(int i) {
		this.score += i;
	}
	
	public String toString() {
		return "Player lane is: " + this.getLane() + ". Player xloc is: " + this.getXloc() + ". Player score is:" + this.score;
	}
}
