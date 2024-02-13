import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;
import org.opencv.photo.Photo;
/**
 *
 * @author sema_
 */
public class exp13_inpainting {
public static void main(String[] args) {
        // OpenCV'yi yükle
        System.loadLibrary("opencv-java490");

        // İlk resmi yükle (görüntüdeki istenmeyen alanı içeren)
        String imagePath = "image.png";
        Mat image = Imgcodecs.imread(imagePath);

        // İkinci resmi yükle (işaretlenmiş alanlar)
        String maskPath = "mask.png";
        Mat mask = Imgcodecs.imread(maskPath, Imgcodecs.IMREAD_GRAYSCALE);

        // İnpainting (istenmeyen alanları silme) işlemi
        Mat inpaintedImage = new Mat();
        Photo.inpaint(image, mask, inpaintedImage, 3, Photo.INPAINT_TELEA);

        // Görüntüyü göster
        HighGui.imshow("Inpainted Image", inpaintedImage);
        HighGui.waitKey(0);

        // Pencereyi kapat
        HighGui.destroyAllWindows();
    }
    
}
