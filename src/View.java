import java.awt.image.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame implements ImageObserver{
	BufferedImage pics1;
	BufferedImage pics2;
	BufferedImage pics3;
	JFrame panel = new JFrame();
// make frame attribute	
	public View() {
		pics1 = CreateImage(0);
		pics2 = CreateImage(1);
		pics3 = CreateImage(2);
		/*BufferedImage img1 = CreateImage(0);
		pics1 = img1.getSubimage(0, 0, Model.imgWidth, Model.imgHeight);
		BufferedImage img2 = CreateImage(1);
		pics2 = img2.getSubimage(0, 0, Model.imgWidth, Model.imgHeight);
		BufferedImage img3 = CreateImage(2);
		pics3 = img3.getSubimage(0, 0, Model.imgWidth, Model.imgHeight);*/		
	}
	
	public void paint(Graphics g, Player p, ArrayList<NPC> obstacles) {
		g.drawImage(pics1, p.getXloc(), p.getYloc(), Color.gray, this);
		for(NPC n : obstacles) {
			if (n.getClass() == new Garbage().getClass()) {
				g.drawImage(pics2, n.getXloc(), n.getYloc(), Color.gray, this);
			}else {
				g.drawImage(pics3, n.getXloc(), n.getYloc(), Color.gray, this);
			}
		}
	}
	public BufferedImage CreateImage(int n) {
		BufferedImage bufferedImage;
    	if(n==0) {
    		try {
    			bufferedImage = ImageIO.read(new File("img/barrier-free-access-png-image-4027.png"));
    			return bufferedImage;
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return null;
    	}
    	else if(n==1) {
    		try {
    			bufferedImage = ImageIO.read(new File("key-png-image-53364.png"));
    			return bufferedImage;
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return null;
    	}
    	else if(n==2) {
    		try {
    			bufferedImage = ImageIO.read(new File("purple-help-button-png-image-30890"));
    			return bufferedImage;
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return null;
    	}
    		return null;
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}

}
