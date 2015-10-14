package protoTypeGameTable;



import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GreenFelt extends JPanel {
	private static final long serialVersionUID = 1L;
	public JFrame mainFrame;
    public JPanel gameBoard;
    public JButton dealButton;
    GreenFelt(){	//constructor
	   mainFrame = new JFrame();
	   gameBoard = new JPanel();
	   dealButton = new JButton("Deal");


	   mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   mainFrame.setBounds(300, 150, 800, 600);
	   mainFrame.add(gameBoard); //adding the panel to the frame   
	   mainFrame.getContentPane().add(new GraphicsDraw()); //drawer of graphics
	   mainFrame.setVisible(true);

	   gameBoard.setBounds(0, 0, 800, 600);
	   dealButton.setBounds(100, 100, 200, 200);
	   gameBoard.setBackground(new Color(39,134,39));	//green
	   gameBoard.add(dealButton);

	   

	  }
  }
