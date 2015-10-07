package graphics2DTesting;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyCanvas extends JPanel {

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(new Color(39,134,39));
    Image img1 = Toolkit.getDefaultToolkit().getImage("C:/Java Work folder/testsyncing/love-letters-master/lovelettercards_Guard_small.jpg");
    Image img2 = Toolkit.getDefaultToolkit().getImage("C:/Java Work folder/testsyncing/love-letters-master/lovelettercards_Guard_small.jpg");
    g2.drawImage(img1, 10, 10, this);
    g2.drawImage(img2, 20, 20, this);

    g2.finalize();
  }
}

public class Graphics2DDrawImage {
  public static void main(String[] a) {
    JFrame mainGame = new JFrame();
    //JPanel gameBoard = new JPanel();
    mainGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainGame.setBounds(300, 150, 800, 600);
    mainGame.setBackground(new Color(39,134,39));
    //mainGame.add(gameBoard);
    mainGame.getContentPane().add(new MyCanvas());
    mainGame.setVisible(true);
    
  }
}