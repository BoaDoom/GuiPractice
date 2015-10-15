package protoTypeGameTable;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class GraphicsDraw extends JPanel {
	int Xcord = 0;
	int Ycord = 0;
	private static final long serialVersionUID = 1L;
	
	public void paint(Graphics g) {

		Graphics2D cardDraw = (Graphics2D) g;
    	Image img1 = Toolkit.getDefaultToolkit().getImage("C:/Java Work folder/testsyncing/love-letters-master/lovelettercards_Guard_small.jpg");
    	cardDraw.drawImage(img1, Xcord, Ycord, this);
    	cardDraw.finalize();    
  	}
	
	public void changeXcord(int x){
		Xcord = x;
	}
	public void changeYcord(int y){
		Ycord = y;
	}
  }
