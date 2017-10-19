
public class NPC extends Character {
	int image;
	int[] imagetype = {1,2,3,4,5};
	
	public NPC() {
		image = imagetype[(int) (Math.random()*5)];
		lane = (int) (Math.random()*5);
		xloc = 700;
		lane = yloc
	}
}
