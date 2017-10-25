
public class NPC extends Character {
	int image;
	int[] imagetype = {1,2,3,4,5};
	int value;
	
	public NPC() {
		image = imagetype[(int) (Math.random()*5)];
		lane = (int) (Math.random()*5);
		yloc = lane*10;
		xloc = 700;
	}
	
	public void moveNPC() {
		xloc = xloc-1;
	}
	
	public String toString() {
		if (this.value ==-100) {
			return "This garbage is in lane:" + this.getLane() + " Its xloc is: " + this.getXloc();
		}
		else {
			return "This food is in lane:" + this.getLane() + " Its xloc is: " + this.getXloc();
		}
	}
}
