import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.core.Rect;
import org.opencv.highgui.HighGui;
/**
 *
 * @author sema_
 */
public class exp2_splitImage {
    public static void main(String[] args) {
    
        // OpenCV'yi yükle
        System.loadLibrary("opencv-java490");

        // Görüntü yolu
        String imagePath = "image.png";

        // Görüntüyü yükle
        Mat image = Imgcodecs.imread(imagePath);

        // Görüntüyü ikiye bölecek şekilde boyutlarını al
        int height = image.rows() / 2;
        
        // İlk yarısı
        Mat firstHalf = new Mat(image, new Rect(0, 0, image.cols(), height));
        // İkinci yarısı
        Mat secondHalf = new Mat(image, new Rect(0, height, image.cols(), height));

        // Görüntülerin ekrana gösterilmesi
        HighGui.imshow("First Half", firstHalf);
        HighGui.imshow("Second Half", secondHalf);

        // Bekle
        HighGui.waitKey(0);
     
    }
    
}
