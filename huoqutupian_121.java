package javakeshe_121;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class huoqutupian_121 {
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME); // �ñ�֤��ִ�и���䣬���ڼ��ؿ⣬���ܵ����������������䣬
	}	
	public static void main(String[] args){
		VideoCapture videoCapture = new VideoCapture(0);
		if(!videoCapture.isOpened()) {
			System.out.println("�ڵ�����δ���������ӵ�����ͷ��");
			return;
		}
		huoqutupian_121.captureImage(videoCapture);
		api_huoqu.easydlImageClassify("D://javakeshetupian/demo.jpg");
	}
	public static void captureImage(VideoCapture vc) {
		Mat image = new Mat();
		vc.read(image);
		vc.set(image.width(), 100);  //���ÿ��
		vc.set(image.height(), 100);  //���ó���
		
		Imgcodecs.imwrite("D://javakeshetupian/demo.jpg", image);

		//HighGui.imshow("��ʾͼ��", image);
		//HighGui.waitKey();
	}
	
	
	
	public static void used() {
		VideoCapture videoCapture = new VideoCapture(0);
		if(!videoCapture.isOpened()) {
			System.out.println("�ڵ�����δ���������ӵ�����ͷ��");
			return;
		}
		huoqutupian_121.captureImage(videoCapture);
		api_huoqu.easydlImageClassify("D://javakeshetupian/demo.jpg");	
	}
	
}
