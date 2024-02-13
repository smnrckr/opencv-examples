import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;
/**
 *
 * @author sema_
 */
public class exp14_colorDetection {
     public static void main(String[] args) {
        // OpenCV'yi yükle
        System.loadLibrary("opencv-490");

        // Görüntüyü yükle
        String imagePath = "image.png";
        Mat image = Imgcodecs.imread(imagePath);

        // İşaretlenmiş maskeyi yükle
        String maskPath = "mask.png";
        Mat mask = Imgcodecs.imread(maskPath, Imgcodecs.IMREAD_GRAYSCALE);

        // Renk filtresi uygula
        Mat filteredImage = new Mat();
        Core.bitwise_and(image, image, filteredImage, mask);

        // Filtrelenmiş görüntüyü göster
        HighGui.imshow("Filtered Image", filteredImage);
        HighGui.waitKey(0);

        // Pencereyi kapat
        HighGui.destroyAllWindows();
    }
    
    
}
