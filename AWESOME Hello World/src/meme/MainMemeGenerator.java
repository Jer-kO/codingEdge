// Package name
package meme;

// Packages needed for this class
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;

// Class definition of MainMemeGenerator
public class MainMemeGenerator {

	// Relative path name of the jpg file from the home directory
	private final static String fileName = "pictures/not_sure_if.jpg";

	// The text at the top of the image
	private final static String topText = "NOT SURE IF STUPID";

	// The text at the bottom of the image
	private final static String bottomText = "OR JUST DUMB";

	// Main method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run(){
				JFrame frame = new JFrame();
				ImageFrame iFrame = new ImageFrame(fileName, topText, bottomText);
				frame.setSize((int) (iFrame.getWidth() + 20), (int) (iFrame.getHeight() + 40));
				System.out.println("Width:" + iFrame.getWidth() + ", Height:" + iFrame.getHeight());
				
				frame.setContentPane(iFrame);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(false);
			}
		}
				);
	}
}

// Inner class ImageFrame
class ImageFrame extends JLayeredPane{

	public ImageFrame(String s){
		ImageComponent component = new ImageComponent(s);
		add(component);
	}

	public ImageFrame(String s, String t, String b){
		setLayout(new OverlayLayout(this));

		JPanel pane = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.CENTER;
		c.weightx = 5;
		c.weighty = 1;	
		c.gridwidth = 3;
		c.gridheight = 1;
		c.insets = new Insets(0,0,123,0);
		c.gridx = 1;
		c.gridy = 0;
		JLabel topLabel = new JLabel(t);
		topLabel.setFont(new Font("Impact", Font.BOLD, 48));
		topLabel.setForeground(Color.WHITE);
		pane.add(topLabel, c);

		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(123,0,0,0);
		JLabel bottomLabel = new JLabel(b);
		bottomLabel.setFont(new Font("Impact", Font.BOLD, 48));
		bottomLabel.setForeground(Color.WHITE);
		pane.add(bottomLabel, c);
		pane.setOpaque(false);
		
		ImageComponent component = new ImageComponent(s);
		int width = component.getWidth();
		int height = component.getHeight();
		setSize(width, height);

		add(pane, new Integer(1));
		
		add(component, new Integer(0));
	}
}		

// Inner class ImageComponent
class ImageComponent extends JComponent {
	private Image meme;
	
	public ImageComponent(String f) {
		try {
			File imageFile = new File(f);
			meme = ImageIO.read(imageFile);
			setSize(meme.getWidth(this), meme.getHeight(this));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void paintComponent (Graphics g){
		if (meme == null) return;
		g.drawImage(meme, 0, 0, this);
		g.dispose();

	}
}