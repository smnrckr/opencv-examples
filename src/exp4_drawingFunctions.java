/**
 *
 * @author sema_
 */
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

public class exp4_drawingFunctions {
    public static void main(String[] args) {
     
     // OpenCV'yi yükle
        System.loadLibrary("opencv-java490");

        // Görüntüyü yükle
        Mat image = Imgcodecs.imread("image.png");
        // yazı fontu
        int font = Imgproc.FONT_HERSHEY_SIMPLEX;
        // Yazı rengi ve boyutu
        Scalar color = new Scalar(0, 255, 0); // Yeşil renk (BGR formatında)
        int thickness = 2; // Çizgi kalınlığı

        // Yazı yazma
        Imgproc.putText(image, "OpenCV Example", new Point(50, 50), font, 1, color, thickness);

        // Çizgi çizme
        Point startPoint = new Point(100, 100);
        Point endPoint = new Point(300, 300);
        Imgproc.line(image, startPoint, endPoint, color, thickness);

        // Daire çizme
        Point center = new Point(200, 200);
        int radius = 50;
        Imgproc.circle(image, center, radius, color, thickness);

        // Dikdörtgen çizme
        Point topLeft = new Point(150, 150);
        Point bottomRight = new Point(250, 250);
        Imgproc.rectangle(image, topLeft, bottomRight, color, thickness);

        // Görüntüyü göster
        HighGui.imshow("Drawing Example", image);
        HighGui.waitKey();

        // Görüntüyü kaydet
        Imgcodecs.imwrite("output.jpg", image);
    
    }
    
}
