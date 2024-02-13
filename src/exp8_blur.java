
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
public class exp8_blur {
    public static void main(String[] args) {
        System.loadLibrary("opencv-java490");    
        String imagePath = "image.png";
        Mat image = Imgcodecs.imread(imagePath);   
        // Median blur işlemi
        Mat medianBlurImage = new Mat();
        Imgproc.medianBlur(image, medianBlurImage, 5); // 5x5 kernel boyutu
        HighGui.imshow("Median Blur", medianBlurImage);
        HighGui.waitKey(0);
        // Bilateral filter işlemi
        Mat bilateralFilterImage = new Mat();
        Imgproc.bilateralFilter(image, bilateralFilterImage, 9, 75, 75); // d=9, sigmaColor=75, sigmaSpace=75
        HighGui.imshow("Bilateral Filter", bilateralFilterImage);
        HighGui.waitKey(0);
        // Gaussian blur işlemi
        Mat gaussianBlurImage = new Mat();
        Imgproc.GaussianBlur(image, gaussianBlurImage, new Size(5, 5), 0); // 5x5 kernel boyutu, sigmaX=0
        HighGui.imshow("Gaussian Blur", gaussianBlurImage);
        HighGui.waitKey(0);
    }
    
}
