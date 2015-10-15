package testingAndTraining;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JpanelTest {
    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab;
    private JLabel picLabel;
    private BufferedImage myPicture;

    public JpanelTest(){
      gui();
    }

    public void gui(){
      f = new JFrame("Game matt");
      f.setSize(1200,800);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      p = new JPanel();
      p.setBackground(new Color(39,134,39));



    	try {
    		myPicture = ImageIO.read(new File("C:/Java Work folder/testsyncing/love-letters-master/lovelettercards_Guard_small.jpg"));
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
      picLabel = new JLabel(new ImageIcon(myPicture));
      p.add(picLabel);
      f.setVisible(true);

      //p.add(b1);
      //p.add(lab);

      f.add(p);
    }
    public static void main(String[] args){
      new JpanelTest();
    }
}
