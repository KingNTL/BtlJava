	package View;
	
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Font;
	import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.File;
	
	
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.SwingConstants;
	import javax.swing.Timer;
	
	
	
	public class SelectChamp1 extends JFrame{
		private JPanel mainPanel;
		private JPanel buttonSelectPanel,buttonDecisionPanel;
		private JButton button_champ1;
		private JButton button_champ2;
		private JButton button_champ3;
		private JButton button_champ5;
		private JButton button_champ4;
		private JPanel buttonPanelSouth;
		private JPanel titlePanel;
		private JLabel dodgeLabel;
		private JLabel selectLabel;
		private JPanel imgPanel;
		private JLabel imgLabel;
		private int frame = 0;
		private long lastCheck =0;
		private JLabel nameLabel;
		
		
		public SelectChamp1()
		{
			init();
		}
		
		
		private void init() 
		{
			setTitle("Dodge Game");
	        setSize(768,576);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); // Center the window on the screen.
	        
	        mainPanel = new BackgroundPanel();
	        mainPanel.setLayout(new BorderLayout());
				
	        
	        Font font_title = null;
			Font font_button = null;
			try {
				  font_title = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Acer\\Downloads\\Compressed\\brick_sans\\BrickSans-Bold.otf")).deriveFont(30f);
				  font_button = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Acer\\Downloads\\Compressed\\brick_sans\\BrickSans-Bold.otf")).deriveFont(72f);
				} catch (Exception e) {
				  font_title = new Font("Arial", Font.PLAIN, 16);
				}
			
			titlePanel = new JPanel();
			titlePanel.setOpaque(false);
			titlePanel.setLayout(new BorderLayout());
			
			dodgeLabel = new JLabel("DODGE GAME");
			dodgeLabel.setFont(font_button);
			dodgeLabel.setForeground(Color.white);
			dodgeLabel.setHorizontalAlignment(SwingConstants.CENTER);
			dodgeLabel.setVerticalTextPosition(SwingConstants.EAST);
			titlePanel.add(dodgeLabel,BorderLayout.CENTER);
			
			selectLabel = new JLabel("SELECT CHAMPION");
			selectLabel.setFont(font_title);
			selectLabel.setForeground(Color.white);
			titlePanel.add(selectLabel,BorderLayout.SOUTH);
			
			
			
			buttonSelectPanel = new JPanel();
			buttonSelectPanel.setOpaque(false);
			buttonSelectPanel.setLayout(new BorderLayout());
			
			imgPanel = new JPanel();
			
			imgPanel.setOpaque(false);
			imgLabel = new JLabel();
			nameLabel = new JLabel();
			
			imgPanel.add(imgLabel);
			imgPanel.add(nameLabel);
			
			buttonSelectPanel.add(imgPanel,BorderLayout.CENTER);
			
			
			buttonPanelSouth = new JPanel();
			buttonPanelSouth.setOpaque(false);
			
			ImageIcon champ1 = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\src\\View\\down_1_1.png");
			button_champ1 = new JButton(champ1);
			button_champ1.setContentAreaFilled(false);
			button_champ1.setOpaque(false);
			button_champ1.setBorderPainted(false);
	
			button_champ1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int newWidth = 150;
					int newHeight=  150;
					Image newImage = champ1.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
					ImageIcon newIcon = new ImageIcon(newImage);
					imgLabel.setIcon(newIcon);
					nameLabel.setText("Long");
					
				}
			});
			buttonPanelSouth.add(button_champ1);
			
			ImageIcon champ2 = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\src\\View\\down_2.png");
			button_champ2 = new JButton(champ2);
			button_champ2.setContentAreaFilled(false);
			button_champ2.setOpaque(false);
			button_champ2.setBorderPainted(false);
			button_champ2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int newWidth = 150;
					int newHeight=  150;
					Image newImage = champ2.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
					ImageIcon newIcon = new ImageIcon(newImage);
					imgLabel.setIcon(newIcon);
					
				}
			});
			buttonPanelSouth.add(button_champ2);
			
			ImageIcon champ3 = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\src\\View\\down_3.png");
			button_champ3 = new JButton(champ3);
			button_champ3.setContentAreaFilled(false);
			button_champ3.setOpaque(false);
			button_champ3.setBorderPainted(false);
			//button_champ3.addActionListener(ctr);
			button_champ3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int newWidth = 150;
					int newHeight=  150;
					Image newImage = champ3.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
					ImageIcon newIcon = new ImageIcon(newImage);
					imgLabel.setIcon(newIcon);
				}
			});
			buttonPanelSouth.add(button_champ3);
			
			ImageIcon champ4 = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\src\\View\\down_4.png");
			button_champ4 = new JButton(champ4);
			button_champ4.setContentAreaFilled(false);
			button_champ4.setOpaque(false);
			button_champ4.setBorderPainted(false);
			button_champ4.setSize(100, 100);
		
			button_champ4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int newWidth = 150;
					int newHeight=  150;
					Image newImage = champ4.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
					ImageIcon newIcon = new ImageIcon(newImage);
					imgLabel.setIcon(newIcon);
				}
			});
			buttonPanelSouth.add(button_champ4);
			
			ImageIcon champ5 = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\src\\View\\down_5.png");
			button_champ5 = new JButton(champ5);
			button_champ5.setContentAreaFilled(false);
			button_champ5.setOpaque(false);
			button_champ5.setBorderPainted(false);
			button_champ5.setSize(100, 100);
			button_champ5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int newWidth = 150;
					int newHeight=  150;
					Image newImage = champ5.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
					ImageIcon newIcon = new ImageIcon(newImage);
					imgLabel.setIcon(newIcon);
				}
			});
			buttonPanelSouth.add(button_champ5);
			
			
			buttonSelectPanel.add(buttonPanelSouth,BorderLayout.SOUTH);
			
			buttonDecisionPanel = new JPanel();
			buttonDecisionPanel.setLayout(new BorderLayout());
			buttonDecisionPanel.setOpaque(false);
	
	        JButton startButton = new JButton("START");
	        startButton.setFont(font_button);
	        startButton.setContentAreaFilled(false);
	        startButton.setOpaque(false);
	        startButton.setBorderPainted(false);
	        startButton.setForeground(Color.white);
	        startButton.setFocusPainted(false);
	        startButton.setBorderPainted(false);
	        buttonDecisionPanel.add(startButton,BorderLayout.EAST);
	        
	        JButton backButton = new JButton("BACK");
	        backButton.setFont(font_button);
	        backButton.setContentAreaFilled(false);
	        backButton.setOpaque(false);
	        backButton.setBorderPainted(false);
	        backButton.setForeground(Color.white);
	        backButton.setFocusPainted(false);
	        backButton.setBorderPainted(false);
	        backButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new StartScreen();
				}
			});
	        buttonDecisionPanel.add(backButton,BorderLayout.WEST);
	        
	        mainPanel.add(buttonSelectPanel,BorderLayout.CENTER);
	        mainPanel.add(buttonDecisionPanel,BorderLayout.SOUTH);
	        mainPanel.add(titlePanel,BorderLayout.NORTH);
			this.add(mainPanel);
			this.setVisible(true);
		}
		
		
		// Custom panel class to draw the background image
	    public class BackgroundPanel extends JPanel {
	        private ImageIcon backgroundImage;
			
	        public BackgroundPanel() {
	            loadImage();
	            Dimension size = new Dimension(backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
	            setPreferredSize(size);
	            setMinimumSize(size);
	            setMaximumSize(size);
	            setSize(size);
	            setLayout(null);
	        }
	        private void loadImage() {
	            // Replace "path/to/your/background/image.png" with the actual image path.
	            backgroundImage = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\src\\View\\background_img.png");
	            
	        }
	       
	        @Override
	        protected void paintComponent(Graphics g)
	        {
	        	super.paintComponent(g);
	        	g.drawImage(backgroundImage.getImage(), 0, 0, null);
	        	g.setColor(Color.white);
	        	g.drawLine(0, 100, 170, 100);
	        	
	        	
	        	//FPS COUNTER
	        	frame++;
	        	if(System.currentTimeMillis()-lastCheck >=1000)
	        	{
	        		lastCheck = System.currentTimeMillis();
	        		System.out.println("FPS:"+frame);
	        		frame =0;
	        	}
	        	repaint();	
	        }
	    }
	    
	    public static void main(String[] args) {
			new SelectChamp1();
		}
	}
