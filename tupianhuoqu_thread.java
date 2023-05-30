package javakeshe_121;

public class tupianhuoqu_thread extends Thread{
	
	public tupianhuoqu_thread() {
		super();
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true)
		{
			huoqutupian_121.used();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}	
	}

}
