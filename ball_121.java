package javakeshe_121;

import javax.swing.JOptionPane;

public class ball_121 extends Thread{
	private int x,y,vx,vy,rad;
	boolean a = false;

	private mypaint pMypaint;
	public boolean getA() {
		return a;
	}


	public void setA(boolean a) {
		this.a = a;
	}


	public ball_121(int x,int y,int vx,int vy,int rad)
	{
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.rad = rad;		
	}
	
	
	public ball_121(int x, int y, int vx, int vy, int rad, mypaint pMypaint) {
		super();
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.rad = rad;
		this.pMypaint = pMypaint;
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getVx() {
		return vx;
	}
	public void setVx(int vx) {
		this.vx = vx;
	}
	public int getVy() {
		return vy;
	}
	public void setVy(int vy) {
		this.vy = vy;
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true)
		{
			if(api_huoqu.read_char=='0')
			{
				a = false;			
			}
			else {
				a = true;
			}
			if(a)
			{
				y = y - vy;	
				//if(x<=50)a=true;

			}
			else {
				y = y + vy;	
				//if(x>=500)a=false;
			}
			x = x+20;			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if(y>=525)
			{			
				JOptionPane.showMessageDialog(null, "你挂了");
				return;
			}
			if(y<=25)
			{			
				JOptionPane.showMessageDialog(null, "你挂了");
				return;
			}
			if(x>=1000)
			{
				JOptionPane.showMessageDialog(null, "你赢了");
				return;		
			}
			pMypaint.repaint();
		}	
	}
}
