
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.photo.Photo;

/**
 *
 * @author sema_
 */
public class exp12_denoising {
    public static void main(String[] args) {
        // OpenCV'yi yükle
        System.loadLibrary("opencv-java490");

        // Görüntüyü yükle
        String imagePath = "image.png";
        Mat image = Imgcodecs.imread(imagePath);

        // Gürültü azaltma işlemi (Denoising)
        Mat denoisedImage = new Mat();
        Photo.fastNlMeansDenoisingColored(image, denoisedImage, 10, 10, 7, 21);

        // Görüntüyü göster
        HighGui.imshow("Denoised Image", denoisedImage);
        HighGui.waitKey(0);

        // Pencereyi kapat
        HighGui.destroyAllWindows();
    }
    
}
