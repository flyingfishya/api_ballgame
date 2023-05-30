package javakeshe_121;

import org.opencv.core.Core;
import org.opencv.videoio.VideoCapture;

public class opencv_test {
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME); // 得保证先执行该语句，用于加载库，才能调用其他操作库的语句，
	}
	public static void main(String[] args) throws Exception {
		VideoCapture videoCapture = new VideoCapture(0);
	}
}
