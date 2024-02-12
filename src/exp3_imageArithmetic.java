import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;
/**
 *
 * @author sema_
 */
public class exp3_imageArithmetic {
    public static void main(String[] args) {
        // OpenCV'yi yükle
        System.loadLibrary("opencv-java490");

        // İlk görüntüyü yükle
        Mat image1 = Imgcodecs.imread("image1.png");

        // İkinci görüntüyü yükle
        Mat image2 = Imgcodecs.imread("image2.png");

        // Görüntülerin boyutlarının eşit olduğundan emin ol
        if (image1.size().equals(image2.size())) {
            // Toplama işlemi
            Mat additionResult = new Mat();
            Core.add(image1, image2, additionResult);
            HighGui.imshow("Addition Result", additionResult);

            // Ağırlıklı toplama işlemi (alpha ve beta değerleri)
            double alpha = 0.5; // İlk görüntünün ağırlığı
            double beta = 0.5; // İkinci görüntünün ağırlığı
            Mat weightedAdditionResult = new Mat();
            Core.addWeighted(image1, alpha, image2, beta, 0.0, weightedAdditionResult);
            HighGui.imshow("Weighted Addition Result", weightedAdditionResult);

            // Çıkarma işlemi
            Mat subtractionResult = new Mat();
            Core.subtract(image1, image2, subtractionResult);
            HighGui.imshow("Subtraction Result", subtractionResult);

            HighGui.waitKey(0);
        } else {
            System.out.println("Görüntülerin boyutları eşit değil!");
        }
    
    }
}
