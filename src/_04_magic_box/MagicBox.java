package _04_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	MediaPalace name=new MediaPalace();
	JFrame frame = new JFrame("The Magic Box contains many secrets...");
	boolean boo=true;
	 /*
		 * We are going to hide secrets within the magic box. 
		 * When the user clicks on a secret place, stuff will happen.
		 * 
		 * 1. Make the frame respond to mouse clicks.
		 
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the magic_box package) to play sounds, 
	 *    show images or speak.
	 * 
	 * 3. Choose 3 different locations on the background image.You can either use the mouse position, 
	 *    or the color of the image, then decide what action the Media Palace should take in each case. 
	 *     backgroundImage.getRGB(e.getX(), e.getY()) will give you the color of the current pixel.
	 */

	BufferedImage backgroundImage;


	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
	
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseListener(this);
		
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/_04_magic_box/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		if(boo) {
		g.drawImage(backgroundImage, 0, 0, null);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouse clicked");
		System.out.println(e.getX()+"\n"+e.getY() );
		if(e.getX()>189 && e.getX()< 204) {
			if(e.getY()>531&&e.getY()<556) {
				name.speak("don't hit me");
			}
		}
		if(e.getX()>68 && e.getX()< 83) {
			if(e.getY()>92&&e.getY()<106) {
				try {
					frame.add(name.loadImageFromTheInternet("https://sciplace.weebly.com/uploads/5/8/9/5/58952045/5208697_orig.jpg"));
					frame.pack();
					name.speak("booom!!! boom booooooooooom boom goodbye world! happy face");
					boo=false;
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		if(e.getX()>323 && e.getX()< 345) {
			if(e.getY()>160&&e.getY()<174) {
				name.speak("yay! spinny spin!");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouse released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouse entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouse exited");
		
	}

}


