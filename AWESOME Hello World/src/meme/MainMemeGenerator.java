package meme;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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

public class MainMemeGenerator {

	private final static String fileName = "./pictures/baby.jpg";

	private final static String topText = "NOT SURE IF TROLLING";

	private final static String bottomText = "OR JUST STUPID";

	public static final int DEFAULT_WIDTH = 750;

	public static final int DEFAULT_HEIGHT = 500;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run(){
				String s = fileName.toString();
				JFrame frame = new JFrame();
				ImagePanel iFrame = new ImagePanel(fileName, topText, bottomText);
				frame.setSize((int) (iFrame.getWidth() * 1.5), (int) (iFrame.getHeight() * 1.5));
				System.out.println("Width:" + iFrame.getWidth() + ", Height:" + iFrame.getHeight());
				frame.setContentPane(iFrame);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//                frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			}
		}
				);
	}
}


class ImagePanel extends JPanel {

	private Image image;
	
	private String topText;
	
	private String bottomText;

	public ImagePanel(String img, String t, String b) {
		this(new ImageIcon(img).getImage(), t, b);
	}

	public ImagePanel(Image img, String t, String b) {
		topText = t;
		bottomText = b;
		this.image = img;
		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
		g.setFont(new Font("Impact", Font.BOLD, 48));
		g.setColor(Color.WHITE);
		g.drawString(topText, 30, 50);
		g.drawString(bottomText, 30, 400);
		g.dispose();
	}

}

class ImageFrame extends JLayeredPane{

	public ImageFrame(String s){
		ImageComponent component = new ImageComponent(s);
		add(component);
	}

	public ImageFrame(String s, String t, String b){
		setLayout(new OverlayLayout(this));

		ImageComponent component = new ImageComponent(s);
		int width = component.getWidth();
		int height = component.getHeight();
		setSize(width, height);

		JLabel topLabel = new JLabel(t);
		topLabel.setFont(new Font("Impact", Font.BOLD, 48));
		topLabel.setForeground(Color.WHITE);
		topLabel.setAlignmentX(CENTER_ALIGNMENT);
		//	        topLabel.setAlignmentY(CENTER_ALIGNMENT);
		//	        topLabel.setLocation(1, 10);
		add(topLabel, new Integer(3));

		JLabel bottomLabel = new JLabel(b);
		bottomLabel.setFont(new Font("Impact", Font.BOLD, 48));
		bottomLabel.setForeground(Color.WHITE);
		bottomLabel.setVerticalTextPosition(SwingConstants.TOP);
		bottomLabel.setAlignmentX(CENTER_ALIGNMENT);
		//	    	bottomLabel.setAlignmentY(CENTER_ALIGNMENT);
		//	    	bottomLabel.setLocation(0, height);
		add(bottomLabel, new Integer(2));

		add(component, new Integer(0));
	}
}		


class ImageComponent extends JComponent {
	Image meme;
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
		if(meme == null) return;
		g.drawImage(meme, 50, 50, this);

	}

}
