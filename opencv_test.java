package javakeshe_121;

import org.opencv.core.Core;
import org.opencv.videoio.VideoCapture;

public class opencv_test {
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME); // �ñ�֤��ִ�и���䣬���ڼ��ؿ⣬���ܵ����������������䣬
	}
	public static void main(String[] args) throws Exception {
		VideoCapture videoCapture = new VideoCapture(0);
	}
}
