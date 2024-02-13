
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sema_
 */
public class exp7_resize {
    public static void main(String[] args) {
        System.loadLibrary("opencv-490");
        String imagePath1 = "image1.png";
        Mat image =Imgcodecs.imread(imagePath1);
         // Yeni boyutu ayarla
        int newWidth = 300; // Yeni genişlik
        int newHeight = 200; // Yeni yükseklik
        
        Mat resizedImage =new Mat();
        Size newSize = new Size(newWidth,newHeight);
        Imgproc.resize(image, resizedImage, newSize);
        HighGui.imshow("Resized Image", resizedImage);
        HighGui.waitKey(0);
    }
    
}
