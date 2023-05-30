package javakeshe_121;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class huoqutupian_121 {
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME); // 得保证先执行该语句，用于加载库，才能调用其他操作库的语句，
	}	
	public static void main(String[] args){
		VideoCapture videoCapture = new VideoCapture(0);
		if(!videoCapture.isOpened()) {
			System.out.println("在电脑上未发现已连接的摄像头！");
			return;
		}
		huoqutupian_121.captureImage(videoCapture);
		api_huoqu.easydlImageClassify("D://javakeshetupian/demo.jpg");
	}
	public static void captureImage(VideoCapture vc) {
		Mat image = new Mat();
		vc.read(image);
		vc.set(image.width(), 100);  //设置宽度
		vc.set(image.height(), 100);  //设置长度
		
		Imgcodecs.imwrite("D://javakeshetupian/demo.jpg", image);

		//HighGui.imshow("显示图像", image);
		//HighGui.waitKey();
	}
	
	
	
	public static void used() {
		VideoCapture videoCapture = new VideoCapture(0);
		if(!videoCapture.isOpened()) {
			System.out.println("在电脑上未发现已连接的摄像头！");
			return;
		}
		huoqutupian_121.captureImage(videoCapture);
		api_huoqu.easydlImageClassify("D://javakeshetupian/demo.jpg");	
	}
	
}
