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

	private final static String fileName = "./pictures/not_sure_if.jpg";

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
				ImageFrame iFrame = new ImageFrame(fileName, topText, bottomText);
				frame.setSize((int) (iFrame.getWidth() + 20), (int) (iFrame.getHeight() + 40));
				System.out.println("Width:" + iFrame.getWidth() + ", Height:" + iFrame.getHeight());
				frame.setContentPane(iFrame);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}
				);
	}
}


class ImageFrame extends JLayeredPane{

	public ImageFrame(String s){
		ImageComponent component = new ImageComponent(s, "");
		add(component);
	}

	public ImageFrame(String s, String t, String b){
		setLayout(new OverlayLayout(this));

		ImageComponent component = new ImageComponent(s, t);
		int width = component.getWidth();
		int height = component.getHeight();
		setSize(width, height);

		JLabel bottomLabel = new JLabel(b);
		bottomLabel.setFont(new Font("Impact", Font.BOLD, 48));
		bottomLabel.setForeground(Color.WHITE);
		bottomLabel.setAlignmentX(CENTER_ALIGNMENT);
		bottomLabel.setAlignmentY(SwingConstants.BOTTOM);
		add(bottomLabel, new Integer(1));

		add(component, new Integer(0));
	}
}		


class ImageComponent extends JComponent {
	private Image meme;
	private String text;
	
	public ImageComponent(String f, String t) {
		try {
			File imageFile = new File(f);
			meme = ImageIO.read(imageFile);
			text = t;
			setSize(meme.getWidth(this), meme.getHeight(this));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void paintComponent (Graphics g){
		if(meme == null) return;
		g.drawImage(meme, 0, 0, this);
		g.setFont(new Font("Impact", Font.BOLD, 48));
		g.setColor(Color.WHITE);
		g.drawString(text, 20, 50);
		g.dispose();

	}
}
