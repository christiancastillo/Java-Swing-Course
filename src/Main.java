import java.awt.Color;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		//new Runnable().		
		JFrame frame = new JFrame("Panel Example");
		JPanel panel = new JPanel();
		JButton button1 = null, button2 = null;
		
		panel.setBounds(40,80,200,200);
		panel.setBackground(Color.gray);
		
		button1 = new JButton("Button 1!");
		button1.setBounds(50,100,80,30);
		button1.setBackground(Color.yellow);
		
		button2 = new JButton("Button 2!");
		button2.setBounds(100,100,80,30);
		button2.setBackground(Color.GREEN);		
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setSize(500,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		//TODO: asdasd
		
		
	}
}
