import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;
import org.opencv.highgui.HighGui;

/**
 *
 * @author sema_
 */
public class exp5_videoCapture {
        public static void main(String[] args) {
        // OpenCV'yi yükle
        System.loadLibrary("opencv-490");

        // Kamera numarası veya video dosyası yolu
        int cameraIndex = 0; 
        VideoCapture capture = new VideoCapture(cameraIndex);

        // Kamera açıldı mı diye kontrol et
        if (!capture.isOpened()) {
            System.out.println("Kamera açılamadı.");
            return;
        }

        //kameradan görüntü al
        while (true) {
            // Kameradan bir kare al
            Mat frame = new Mat();
            capture.read(frame);

            // Kameradan alınan kare boş değilse işlem yap
            if (!frame.empty()) {
                // Görüntüyü göster
                HighGui.imshow("frame", frame);

                // Kullanıcı q tuşuna basarsa döngüyü kır
                if (HighGui.waitKey(1) == 'q') {
                    break;
                }
            } else {
                System.out.println("Kare alınamadı.");
                break;
            }
        }

        // Kamerayı serbest bırak
        capture.release();

        // Pencereyi kapat
        HighGui.destroyAllWindows();
    }

    
}



