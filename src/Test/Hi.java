package Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hi {
    public void Test(){
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\13902\\Videos\\Diablo Ii Resurrected\\1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
