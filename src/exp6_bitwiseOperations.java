import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sema_
 */
public class exp6_bitwiseOperations {
    public static void main(String[] args) {
        System.loadLibrary("openvc-490");
        String imagePath1 = "image.png" ;
        Mat image1=Imgcodecs.imread(imagePath1);
        String imagePath2 = "image2.png";
        Mat image2=Imgcodecs.imread(imagePath2);
        //AND
        Mat bitwiseAnd=new Mat();
        Core.bitwise_and(image1, image2, bitwiseAnd);
        HighGui.imshow("Bitwise AND", bitwiseAnd);
        HighGui.waitKey(0);
        // Bitwise OR işlemi
        Mat bitwiseOr = new Mat();
        Core.bitwise_or(image1, image2, bitwiseOr);
        HighGui.imshow("Bitwise OR", bitwiseOr);
        HighGui.waitKey(0);
        // Bitwise XOR işlemi
        Mat bitwiseXor = new Mat();
        Core.bitwise_xor(image1, image2, bitwiseXor);
        HighGui.imshow("Bitwise XOR", bitwiseXor);
        HighGui.waitKey(0);
        // Bitwise NOT işlemi (Tek bir görüntü üzerinde uygulandığı için birinci görüntü kullanılacak)
        Mat bitwiseNot = new Mat();
        Core.bitwise_not(image1, bitwiseNot);
        HighGui.imshow("Bitwise NOT", bitwiseNot);
        HighGui.waitKey(0);
        // Pencereleri kapat
        HighGui.destroyAllWindows();
        
    }
            
    
}
