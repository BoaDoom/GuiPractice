package testingAndTraining;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
 
/*
 * W7R.blogspot.com
 * Brian R. H.
 */
 
public class MyPanel extends JPanel implements ActionListener{
 int ovalX=400,ovalY=400,ovalWidth=50,ovalHeight=30;
 int rectX = 200, rectY = 200, rectWidth = 20, rectHeight = 10;
 int rectDx=10,  rectDy=10; //change in Y
 int ovalDx=-20, ovalDy=-10;
 
 //        1 tick/second
 Timer clock = new Timer(10,this);
 
 MyPanel(){
  setSize(800,600);
  clock.start();
 }
 @Override
 public void paint(Graphics g){
  //  paint occurs when the method repaint() is called (see actionPerformed method )
  Graphics2D g2d = (Graphics2D) g;
  g2d.setBackground(new Color(39,134,39));
  g2d.clearRect(0, 0, 800, 600);
  g2d.setColor(Color.black);
  g2d.drawRoundRect(rectX, rectY, rectWidth, rectHeight, 10, 10);
  g2d.setColor(Color.blue);
  g2d.drawOval(ovalX, ovalY, ovalWidth, ovalHeight);


 }
 public static void main(String[] args) {
  JFrame j = new JFrame("Title");
  JPanel p = new MyPanel();
  j.setContentPane(p);
  j.setSize(800,600);
  j.setVisible(true);
  p.setVisible(true);
 }
 private void updateVectors() {
  rectX+=rectDx;
  rectY+=rectDy;
  ovalX+=ovalDx;
  ovalY+=ovalDy;
 }
 @Override
 public void actionPerformed(ActionEvent arg0) {
  repaint();
  updateVectors();
  
 }
}
