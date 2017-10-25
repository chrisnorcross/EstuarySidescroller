import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class Board {
	public Player player;
	public int timer =4500;
	private ArrayList<NPC> obstacles;
	
	Board(){
		player = new Player();
		obstacles = new ArrayList();
		}
	public void GameTick() {
		timer-=1;
	}
	public void spawnNPC() {
		Random rand = new Random();
		int x = rand.nextInt(2);
		if (x==1) {
			Garbage garb = new Garbage();
			obstacles.add(garb);
		}else {
			Food food = new Food();
			obstacles.add(food);
		}
	}
	public void moveUp() {
		if(player.getLane()==5) {
			return;
		}else {
			player.JumpUp();
		}
	}
	public void moveDown() {
		if(player.getLane()==1) {
			return;
		}else {
			player.JumpDown();
		}
	}
	public void removeNPC(int i) {
		obstacles.remove(i);
	}
	public void moveNPC() {
		for (int i =0; i<(obstacles.size());i++) {
			obstacles.get(i).moveNPC();
			if(obstacles.get(i).getXloc()<0) {
				obstacles.remove(i);
			}
			if(obstacles.get(i).getXloc()==player.getXloc() && obstacles.get(i).getLane()==player.getLane()) {
				System.out.println("Collision");
				if(obstacles.get(i).value ==100) {
					player.collisions.add("Hit a food");
				}else {
					player.collisions.add("Hit garbage");
				}
				player.setScore(obstacles.get(i).value);
				obstacles.remove(i);
			}
		}
	}
	public void takeTurn() {
		GameTick();
		if(timer%50==0) {
			spawnNPC();
		}moveNPC();
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		int j =1;
		while (board.timer > 0) {
			System.out.println("Turn " + j);
			board.takeTurn();
			j++;
			System.out.println(board.player);
			for(NPC n: board.obstacles) {
				System.out.println(n);
			}
		}
		for(String s : board.player.collisions) {
			System.out.println(s);
		}
	}
}

