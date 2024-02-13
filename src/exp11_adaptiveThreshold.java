/**
 *
 * @author sema_
 */
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

public class exp11_adaptiveThreshold {
    public static void main(String[] args) {
        // OpenCV'yi yükle
        System.loadLibrary("opencv-java490");

        // Görüntüyü yükle
        String imagePath = "image.png";
        Mat image = Imgcodecs.imread(imagePath);

        // Görüntüyü gri tonlama dönüştür
        Mat grayImage = new Mat();
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);

        // Adaptif eşikleme işlemi
        Mat thresholdedImage = new Mat();
        Imgproc.adaptiveThreshold(grayImage, thresholdedImage, 255, Imgproc.ADAPTIVE_THRESH_MEAN_C, Imgproc.THRESH_BINARY, 11, 2);
        
        // Görüntüyü göster
        HighGui.imshow("Adaptive Thresholding", thresholdedImage);
        HighGui.waitKey(0);

        // Pencereyi kapat
        HighGui.destroyAllWindows();
    }
}
