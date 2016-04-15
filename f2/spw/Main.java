package f2.spw;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {
	public static void main(String[] args){
		JButton b1;
		JLabel l1;
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setLayout(new BorderLayout());
 		GamePanel gp = new GamePanel();
 		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);    	

	}
}
