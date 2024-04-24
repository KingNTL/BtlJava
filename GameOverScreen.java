package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GameOverScreen extends JFrame {

    private Font font_letter;

	public GameOverScreen() {
        setTitle("Dodge Game");
        setSize(768, 576); // Set the size based on the image resolution
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen
        setResizable(false);
        Font font_title,font_button;
        try {
			  font_title = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Acer\\Downloads\\Compressed\\brick_sans\\BrickSans-Bold.otf")).deriveFont(60f);
			  font_button = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Acer\\Downloads\\Compressed\\brick_sans\\BrickSans-Bold.otf")).deriveFont(30f);
			  font_letter = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Acer\\Downloads\\Compressed\\brick_sans\\BrickSans-Bold.otf")).deriveFont(18f);
			} catch (Exception e) {
			  font_title = new Font("Arial", Font.PLAIN, 16);
			  font_button = new Font("Arial",Font.BOLD,16);
			  font_letter = new Font("Arial",Font.BOLD,16);
			}

        // Set the background panel
        BackgroundPanel bgPanel = new BackgroundPanel();
        setContentPane(bgPanel);

        // Set the layout to null for absolute positioning
        bgPanel.setLayout(null);

        // Title labels
        JLabel titleLabel = new JLabel("DODGE GAME", SwingConstants.CENTER);
        styleLabel(titleLabel, font_title, Color.WHITE);
        titleLabel.setBounds(00, 30, 768, 40);
        bgPanel.add(titleLabel);

        JLabel gameOverLabel = new JLabel("GAME OVER", SwingConstants.CENTER);
        styleLabel(gameOverLabel, font_title, Color.WHITE);
        gameOverLabel.setBounds(0, 90, 768, 35);
        bgPanel.add(gameOverLabel);

        // Score section
        JLabel timeLabel = new JLabel("Time 0000", SwingConstants.LEFT);
        styleLabel(timeLabel, font_button, Color.WHITE);
        timeLabel.setBounds(50, 150, 300, 30);
        bgPanel.add(timeLabel);

        JLabel totalPointLabel = new JLabel("Total Point 9999", SwingConstants.LEFT);
        styleLabel(totalPointLabel,font_button, Color.WHITE);
        totalPointLabel.setBounds(50, 200, 300, 30);
        bgPanel.add(totalPointLabel);

        // Rank section
        JLabel rankLabel = new JLabel("<html>1. ABCXYZ: 9999999<br/>2. ABCXYZ: 8888888<br/>3. ABCXYZ: 7777777<br/>4. ABCXYZ: 6666666<br/>...</html>", SwingConstants.LEFT);
        styleLabel(rankLabel, font_button, Color.WHITE);
        rankLabel.setFont(font_button);
        rankLabel.setBounds(400, 150, 300, 200);
        bgPanel.add(rankLabel);

        // Buttons
        JButton playAgainButton = new JButton("PLAY AGAIN");
        styleButton(playAgainButton,font_button, new Color(0x666699));
        playAgainButton.setBounds(184, 400, 180, 50);
        playAgainButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
     
        

        JButton exitButton = new JButton("EXIT");
        styleButton(exitButton, font_button, new Color(0x666699));
        exitButton.setBounds(404, 400, 180, 50);
        exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
        bgPanel.add(exitButton);
        bgPanel.add(playAgainButton);

        // Set the frame visible
        setVisible(true);
    }

    private void styleLabel(JLabel label, Font font, Color color) {
        label.setFont(font);
        label.setForeground(color);
        label.setOpaque(false);
    }

    private void styleButton(JButton button, Font font, Color bgColor) {
        button.setFont(font);
        button.setBackground(bgColor);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
    }

    class BackgroundPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw the background color
            g.setColor(new Color(0x666699));
            g.fillRect(0, 0, getWidth(), getHeight());

            // Draw custom graphics or load an image as the background if needed
            // For example, to load an image:
             ImageIcon background = new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\Game\\src\\View\\background_img.png");
             g.drawImage(background.getImage(), 0, 0, this);

            // Custom lines
            g.setColor(Color.WHITE);
            g.drawLine(50, 130, 718, 130);
            g.drawLine(50, 370, 718, 370);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameOverScreen());
    }
}
