package graphics2DTesting;
// http://www.tutorialspoint.com/swing/swing_action_listener.htm
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyCanvas extends JPanel {

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
    	Image img1 = Toolkit.getDefaultToolkit().getImage("C:/Java Work folder/testsyncing/love-letters-master/lovelettercards_Guard_small.jpg");
    	Image img2 = Toolkit.getDefaultToolkit().getImage("C:/Java Work folder/testsyncing/love-letters-master/lovelettercards_Guard_small.jpg");
    	g2.drawImage(img1, 10, 10, this);
    	g2.drawImage(img2, 20, 20, this);
    	g2.finalize();    
  	}
  }

public class GameTable2 {
    public JFrame mainGame;
    public JPanel gameBoard;
    public JButton dealButton;
	  public static void main(String[] a) {
		createGui();  
	  }
	  
	  public void createGui(){
	    mainGame = new JFrame();
	    gameBoard = new JPanel();
	    dealButton = new JButton("Deal");
	    mainGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    mainGame.setBounds(300, 150, 800, 600);
	    gameBoard.setBounds(0, 0, 800, 600);
	    gameBoard.setBackground(new Color(39,134,39));
	    mainGame.add(gameBoard);
	    gameBoard.add(dealButton);
	    mainGame.getContentPane().add(new MyCanvas());
	    mainGame.setVisible(true);
	  }
	  
	  class DealButton implements ActionListener{
		  public void actionPerformed(ActionEvent e) {
	          dealButton.setText("Ok Button Clicked.");
	      }
	  }
	  

}