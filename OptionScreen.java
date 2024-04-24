package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

public class OptionScreen extends JFrame{
	private mainPanel mainpanel;
	
	private JLabel w_label;
	private JLabel up_label;
	private JLabel s_label;
	private JLabel a_label;
	private JLabel d_label;
	private JLabel down_label;
	private JLabel right_label;
	private JLabel left_label;
	private JLabel k_label;
	private JLabel j_label;
	
	private JLabel flash_label;
	private JLabel ghost_label;

	private JLabel label_1;

	private JLabel label_2;
	
	public OptionScreen() {
		
		init();
	}

	public void init() {
		setTitle("Dodge Game");
        setSize(768,576);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen.
        
        
        Font font_title = null;
		Font font_button = null;
		Font font_letter = null;
		mainpanel = new mainPanel() ;
		mainpanel.setLayout(null);
		try {
			  font_title = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Acer\\Downloads\\Compressed\\brick_sans\\BrickSans-Bold.otf")).deriveFont(72f);
			  font_button = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Acer\\Downloads\\Compressed\\brick_sans\\BrickSans-Bold.otf")).deriveFont(72f);
			  font_letter = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Acer\\Downloads\\Compressed\\brick_sans\\BrickSans-Bold.otf")).deriveFont(48f);
			} catch (Exception e) {
			  font_title = new Font("Arial", Font.PLAIN, 16);
			}
		
		
		JLabel titleLabel = new JLabel("DODGE GAME");
		titleLabel.setFont(font_title);
		titleLabel.setForeground(Color.white);
		titleLabel.setBounds(220, -100, 300, 300);
		
		JLabel moveLabel = new JLabel("MOVEMENT");
		moveLabel.setFont(font_letter);
		moveLabel.setForeground(Color.white);
		moveLabel.setBounds(100, 30, 200, 200);
		
		JLabel spellLabel = new JLabel("SPELL");
		spellLabel.setFont(font_letter);
		spellLabel.setForeground(Color.white);
		spellLabel.setBounds(500, 30, 200, 200);
		
		ImageIcon wIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\w.jpg");
		w_label = new JLabel(wIcon);
		w_label.setBounds(100, 140, 150, 150);
		
		ImageIcon sIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\s.jpg");
		s_label = new JLabel(sIcon);
		s_label.setBounds(100, 190, 150, 150);
		
		ImageIcon aIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\A.jpg");
		a_label = new JLabel(aIcon);
		a_label.setBounds(50, 190, 150, 150);
		
		ImageIcon dIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\D.jpg");
		d_label = new JLabel(dIcon);
		d_label.setBounds(150, 190, 150, 150);
		
		ImageIcon upIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\up.jpg");
		up_label = new JLabel(upIcon);
		up_label.setBounds(100, 250, 150, 150);
		
		ImageIcon downIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\Down.jpg");
		down_label = new JLabel(downIcon);
		down_label.setBounds(100, 300, 150, 150);
		
		ImageIcon leftIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\left.jpg");
		left_label = new JLabel(leftIcon);
		left_label.setBounds(50, 300, 150, 150);
		
		ImageIcon rightIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\Right.jpg");
		right_label = new JLabel(rightIcon);
		right_label.setBounds(150, 300, 150, 150);
		
		ImageIcon flashIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\src\\View\\flash.jpg");
		flash_label = new JLabel(flashIcon);
		flash_label.setBounds(400, 220, 150, 150);
		
		ImageIcon ghostIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\src\\View\\ghost.jpg");
		ghost_label = new JLabel(ghostIcon);
		ghost_label.setBounds(550, 220, 150, 150);
		
		ImageIcon jIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\J.jpg");
		j_label = new JLabel(jIcon);
		j_label.setBounds(400, 120, 150, 150);
		
		ImageIcon kIcon = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\K.jpg");
		k_label = new JLabel(kIcon);
		k_label.setBounds(550, 120, 150, 150);
		
		ImageIcon Icon1 = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\1.jpg");
		label_1 = new JLabel(Icon1);
		label_1.setBounds(400, 320, 150, 150);
		
		ImageIcon Icon2 = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\Move\\2.jpg");
		label_2 = new JLabel(Icon2);
		label_2.setBounds(550, 320, 150, 150);
		
		JButton back_button = new JButton("BACK");
		back_button.setContentAreaFilled(false);
		back_button.setOpaque(false);
		back_button.setFont(font_button);
		back_button.setBorderPainted(false);
		back_button.setForeground(Color.white);
		back_button.setBounds(20, 400, 150, 150);
		back_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new StartScreen();
			}
		});
		
		mainpanel.add(back_button);
		mainpanel.add(label_1);
		mainpanel.add(label_2);
		mainpanel.add(j_label);
		mainpanel.add(k_label);
		mainpanel.add(ghost_label);
		mainpanel.add(flash_label);
		mainpanel.add(right_label);
		mainpanel.add(down_label);
		mainpanel.add(left_label);
		mainpanel.add(up_label);
		mainpanel.add(d_label);
		mainpanel.add(a_label);
		mainpanel.add(s_label);
		mainpanel.add(w_label);
        mainpanel.add(spellLabel);
        mainpanel.add(moveLabel);
		mainpanel.add(titleLabel);
       
        this.add(mainpanel);
        this.setVisible(true);
	}
	public class mainPanel extends JPanel
	{	
		public ImageIcon background;
		public void paintComponent(Graphics g)
		{
			super.paintComponents(g);
			background = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\src\\View\\background_img.png");
			g.drawImage(background.getImage(), 0, 0, null);
			
			
		}
	}
	public static void main(String[] args) {
		new OptionScreen();
	}
}
