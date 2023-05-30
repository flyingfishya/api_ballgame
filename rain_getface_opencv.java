package javakeshe_121;

import java.net.URL;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.VideoWriter;
 
public class rain_getface_opencv { 
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME); // �ñ�֤��ִ�и���䣬���ڼ��ؿ⣬���ܵ����������������䣬
	}
	public static void main(String[] args) throws Exception {
        // ���ض�̬��
        //URL url = ClassLoader.getSystemResource("opencv_java451.dll");
        //System.load(url.getPath());
		VideoCapture vc = new VideoCapture(0);
		if(!vc.isOpened()) {
			System.out.println("�ڵ�����δ���������ӵ�����ͷ��");
			return;
		}
		captureImage(vc);
		captureVideo(vc);
	}
 
	private static void captureImage(VideoCapture vc) {
		Mat image = new Mat();
		vc.read(image);
		Imgcodecs.imwrite("D:\\demo.jpg", image);
		HighGui.imshow("��ʾͼ��", image);
		HighGui.waitKey();
	}
 
	private static void captureVideo(VideoCapture vc) throws InterruptedException {
		Mat image = new Mat();
		vc.read(image);
		VideoWriter vw = new VideoWriter();
		vw.open("D:\\demo.avi", VideoWriter.fourcc('D', 'I', 'V', 'X'), 25.0, new Size(image.width(), image.height()));
		System.out.println(vw.isOpened());
		for(int i=0;i<50;i++) {//����50֡����Ƶ����Ϊ2��
			vc.read(image);
			if(image.empty()) {
				Thread.sleep(40);
				continue;
			}
			vw.write(image);
			Thread.sleep(400);//400ms����һ�Σ��൱��֡��Ϊ25
			System.out.println("read frame "+i);
		}
		vw.release();
		System.out.println("read finish!");
	}
 
}

