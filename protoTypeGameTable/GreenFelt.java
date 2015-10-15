package protoTypeGameTable;



import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GreenFelt extends JPanel {
	private static final long serialVersionUID = 1L;
	public JFrame mainFrame;
    public JPanel gameBoard;
    public JButton dealButton;
    public GraphicsDraw graphicsDraw;
    public JLabel cardPicture;
    GreenFelt(){	//constructor
	   mainFrame = new JFrame();
	   gameBoard = new JPanel();
	   cardPicture = new JLabel();
	   gameBoard.setLayout(null);
	   graphicsDraw = new GraphicsDraw();

	   dealButton = new JButton("Deal");
	   mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   mainFrame.setBounds(300, 150, 786, 593);

	   
	   gameBoard.setBackground(new Color(39,134,39));
	   dealButton.setBounds(136, 506, 71, 23);
	   cardPicture.setBounds(66, 93, 118, 167);



	   //gameBoard.add(dealButton);
	   gameBoard.add(graphicsDraw.getGuardCard()); //drawer of graphics
	   mainFrame.getContentPane().add(gameBoard); //adding the panel to the frame  

	   //graphicsDraw.changeXcord(50);
	   //graphicsDraw.changeYcord(50);

	   mainFrame.setVisible(true);





	   

	  }
  }
