package View;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;


public class StartScreen extends JFrame{
	private JButton button_start;
	private JButton button_option;
	private JButton button_exit;
	private Graphics g;
	private JDialog volumeControlDialog;
	private JSlider volumeSlider;
	
	public StartScreen()
	{
		this.init();
	}
	
	public void init() {
		this.setTitle("DODGE GAME");
		this.setSize(768,576);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		//this.setResizable(false);
		
		ControllerStartScreen ctr = new ControllerStartScreen(this);
		//Thiết lập font chữ
		Font font = new Font(Font.DIALOG,Font.BOLD,40);
		Font font_title = null;
		Font font_button = null;
		try {
			  font_title = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Acer\\Downloads\\Compressed\\brick_sans\\BrickSans-Bold.otf")).deriveFont(100f);
			  font_button = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Acer\\Downloads\\Compressed\\brick_sans\\BrickSans-Bold.otf")).deriveFont(72f);

			} catch (Exception e) {
			  font_title = new Font("Arial", Font.PLAIN, 16);
			}
		//thiết lập lớp 
		JLayeredPane pane = new JLayeredPane();
		
		//Thiết lập background 
		JLabel label_background = new JLabel();
		label_background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(StartScreen.class.getResource("background_img.png"))));
		label_background.setBounds(0,0, 768, 576);
		pane.add(label_background,new Integer(0));
		
		
		JLabel label_dodge = new JLabel("DODGE");
		
		label_dodge.setBounds(270,5,200,200);
		pane.add(label_dodge,new Integer(10));
		label_dodge.setFont(font_title);
		label_dodge.setHorizontalAlignment(SwingConstants.CENTER);
		label_dodge.setVerticalTextPosition(SwingConstants.CENTER);
		label_dodge.setForeground(Color.white);
		
		
		JLabel label_game = new JLabel("GAME");
		label_game.setBounds(270,80,200,200);
		pane.add(label_game,new Integer(10));
		label_game.setFont(font_title);
		label_game.setHorizontalAlignment(SwingConstants.CENTER);
		label_game.setVerticalTextPosition(SwingConstants.CENTER);
		label_game.setForeground(Color.white);
		
		
		JLabel label_left = new JLabel();
		label_left.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(StartScreen.class.getResource("down_1_1.png"))));
		label_left.setBounds(150, 30, 300, 300);
		pane.add(label_left,new Integer(10));
		
		JLabel label_right = new JLabel();
		label_right.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(StartScreen.class.getResource("down_3.png"))));
		label_right.setBounds(480, 30, 300, 300);
		pane.add(label_right,new Integer(10));
		
	
		button_start = new JButton("START");
		button_start.setForeground(Color.white);
		button_start.setBounds(270, 250, 200, 100);
		button_start.setOpaque(true);
		button_start.setBorderPainted(false);
		button_start.setContentAreaFilled(false);
		button_start.setFont(font_button);
		button_start.addActionListener(ctr);
		
		pane.add(button_start,new Integer(10));
		
		
		button_option = new JButton("OPTION");
		button_option.setFont(font);
		button_option.setBounds(240, 350, 250, 100);
		button_option.setOpaque(true);
		button_option.setBorderPainted(false);
		button_option.setContentAreaFilled(false);
		button_option.setFont(font_button);
		button_option.setHorizontalAlignment(SwingConstants.CENTER);
		button_option.setVerticalAlignment(SwingConstants.CENTER);
		button_option.setForeground(Color.white);
		button_option.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				  new OptionScreen();
			}
		});
		
		pane.add(button_option,new Integer(10));
		
		button_exit = new JButton("EXIT");
		button_exit.setFont(font);
		button_exit.setBounds(270, 450, 200, 100);
		button_exit.setOpaque(false);
		button_exit.setBorderPainted(false);
		button_exit.setContentAreaFilled(false);
		button_exit.setFont(font_button);
		button_exit.setHorizontalAlignment(SwingConstants.CENTER);
		button_exit.setVerticalAlignment(SwingConstants.CENTER);
		button_exit.setForeground(Color.white);
		button_exit.addActionListener(ctr);
		
		
		pane.add(button_exit,new Integer(10));
		
		
		this.add(pane);
	
		this.setVisible(true);
	}
	public void initializeVolumnControlDialog()
	{
		//volumeControlDialog = new JDialog(this,"Volumne Control",true);
		volumeControlDialog = new JDialog();
		volumeControlDialog.setSize(400,200);
		volumeControlDialog.setResizable(false);
		volumeControlDialog.setLocationRelativeTo(this);
		
		volumeSlider = new JSlider(JSlider.HORIZONTAL,0,100,50);
		volumeSlider.setMajorTickSpacing(10);
		volumeSlider.setPaintTicks(true);
		volumeSlider.setPaintLabels(true);
		
		
		volumeControlDialog.add(volumeSlider);
	}
	public void showVolumeControlDialog()
	{	if(volumeControlDialog == null)
		{
		initializeVolumnControlDialog();
		}
	volumeControlDialog.setVisible(true);
	}
	public static void main(String[] args) {
		new StartScreen();
	}
}
