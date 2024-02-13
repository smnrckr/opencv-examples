/**
 *
 * @author sema_
 */
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;
import org.opencv.core.Size;

public class exp10_Morphology {
    public static void main(String[] args) {
        // OpenCV'yi yükle
        System.loadLibrary("opencv-java490");

        // Görüntüyü yükle
        String imagePath = "image.png";
        Mat image = Imgcodecs.imread(imagePath);

        // Structuring element (kernel) tanımla
        Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(3, 3));

        // Erozyon işlemi
        Mat erodedImage = new Mat();
        Imgproc.erode(image, erodedImage, kernel);
        HighGui.imshow("Eroded Image", erodedImage);
        HighGui.waitKey(0);

        // Genişleme işlemi
        Mat dilatedImage = new Mat();
        Imgproc.dilate(image, dilatedImage, kernel);
        HighGui.imshow("Dilated Image", dilatedImage);
        HighGui.waitKey(0);

        // Kapanma işlemi
        Mat closedImage = new Mat();
        Imgproc.morphologyEx(image, closedImage, Imgproc.MORPH_CLOSE, kernel);
        HighGui.imshow("Closed Image", closedImage);
        HighGui.waitKey(0);

        // Açılma işlemi
        Mat openedImage = new Mat();
        Imgproc.morphologyEx(image, openedImage, Imgproc.MORPH_OPEN, kernel);
        HighGui.imshow("Opened Image", openedImage);
        HighGui.waitKey(0);

        // Pencereleri kapat
        HighGui.destroyAllWindows();
    }
    
}
