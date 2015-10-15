package protoTypeGameTable;


import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GraphicsDraw {
	int Xcord = 0;
	int Ycord = 0;
	private BufferedImage loadImage;
	private JLabel guardCard;
	
	GraphicsDraw() {
		
		try {
    		loadImage = ImageIO.read(new File("C:/Java Work folder/Pictures/LoveLetter/lovelettercards_Guard_small.jpg"));
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	guardCard = new JLabel(new ImageIcon(loadImage));
    	guardCard.setBounds(Xcord, Ycord, 118, 167);
    	
  
  	}
	public JLabel getGuardCard(){
		return guardCard;
	}
	public void changeXcord(int x){
		Xcord = x;
	}
	public void changeYcord(int y){
		Ycord = y;
	}

  }
