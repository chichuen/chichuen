package Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class HiTest {

    @org.junit.jupiter.api.Test
    void test() {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\13902\\Videos\\Diablo Ii Resurrected\\1.png"));
            assertNotNull(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}