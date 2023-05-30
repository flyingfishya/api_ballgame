package javakeshe_121;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.opencv.core.Core;

public class mypaint extends JPanel {
	private ball_121 ball;
	private tupianhuoqu_thread huoqutupian;

	/**
	 * Create the panel.
	 */
	public mypaint() {
		 System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		 ball = new ball_121(10, 10, 50, 50, 100,this);
		 huoqutupian = new tupianhuoqu_thread();
		 ball.start();
		 huoqutupian.start();
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO 自动生成的方法存根
		super.paint(g);
		g.setColor(Color.black);	
		g.clearRect(100, 25, 1000, 600);	
		g.setColor(Color.cyan);	
		g.fillOval(ball.getX(), ball.getY(), 100,100);
	}

}
