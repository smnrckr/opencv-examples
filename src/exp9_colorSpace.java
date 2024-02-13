/**
 *
 * @author sema_
 */
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;


public class exp9_colorSpace {
    public static void main(String[] args) {
   
        System.loadLibrary("opencv-java490");
        
        String imagePath = "image.png";
        Mat image = Imgcodecs.imread(imagePath);
        
        HighGui.imshow("Image", image);

        HighGui.waitKey(0);
        // Görüntüyü BGR'den GRAY'e dönüştür
        Mat grayImage = new Mat();
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);
        HighGui.imshow("Gray Image", grayImage);
        HighGui.waitKey(0);

        // Görüntüyü BGR'den HSV'ye dönüştür
        Mat hsvImage = new Mat();
        Imgproc.cvtColor(image, hsvImage, Imgproc.COLOR_BGR2HSV);
        HighGui.imshow("HSV Image", hsvImage);
        HighGui.waitKey(0);

        // Görüntüyü BGR'den LAB'ye dönüştür
        Mat labImage = new Mat();
        Imgproc.cvtColor(image, labImage, Imgproc.COLOR_BGR2Lab);
        HighGui.imshow("LAB Image", labImage);
        HighGui.waitKey(0);

        // Pencereleri kapat
        HighGui.destroyAllWindows();        

    }

}