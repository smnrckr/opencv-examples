/**
 *
 * @author sema_
 */
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;


public class Main {
    public static void main(String[] args) {
   
        System.loadLibrary("opencv-java490");
        
        String imagePath = "image.png";
        Mat image = Imgcodecs.imread(imagePath);
        
        HighGui.imshow("Image", image);

        HighGui.waitKey(0);
        
    

    
    
    
    }

}

