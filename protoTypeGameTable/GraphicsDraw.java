package protoTypeGameTable;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class GraphicsDraw extends JPanel {
	int Xcord;
	int Ycord;
	private static final long serialVersionUID = 1L;
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
    	Image img1 = Toolkit.getDefaultToolkit().getImage("C:/Java Work folder/testsyncing/love-letters-master/lovelettercards_Guard_small.jpg");
    	Image img2 = Toolkit.getDefaultToolkit().getImage("C:/Java Work folder/testsyncing/love-letters-master/lovelettercards_Guard_small.jpg");
    	g2.drawImage(img1, 50, 50, this);
    	g2.drawImage(img2, 80, 80, this);
    	g2.finalize();    
  	}
  }
