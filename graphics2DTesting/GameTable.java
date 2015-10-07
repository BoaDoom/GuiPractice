package graphics2DTesting;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GameTable extends JPanel implements ActionListener{
  private BufferedImage guardCard;
  private JFrame mainFrame;
  private JPanel gameBoard;  
  public static void main(String[] args) {
    //JFrame j = new JFrame("Title");
    //JPanel p = new GameTable();
    JFrame mainFrame = new JFrame("Title");
    JPanel gameBoard = new GameTable();
    mainFrame.getC
    mainFrame.setContentPane(gameBoard);
    mainFrame.setSize(800,600);
    mainFrame.setVisible(true);
    gameBoard.setVisible(true);
  }

  GameTable(){
    try {
      guardCard = ImageIO.read(new File("C:/Java Work folder/testsyncing/love-letters-master/lovelettercards_Guard_small.jpg"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    gameBoard.add(guardCard);
    mainFrame.setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent arg0) {
  }
}
