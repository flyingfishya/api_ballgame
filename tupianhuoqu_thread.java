package javakeshe_121;

public class tupianhuoqu_thread extends Thread{
	
	public tupianhuoqu_thread() {
		super();
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true)
		{
			huoqutupian_121.used();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}	
	}

}
