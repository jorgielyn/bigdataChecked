package image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ConvertBlackWhite{
 BufferedImage image;
   int width;
   int height;

   public ConvertBlackWhite() {

      

        try {

            File input = new File("C:\\Users\\iranjo_sd2082\\Desktop\\flower.png");
            BufferedImage image = ImageIO.read(input);

            BufferedImage result = new BufferedImage(
                    image.getWidth(),
                    image.getHeight(),
                    BufferedImage.TYPE_BYTE_BINARY);

            Graphics2D graphic = result.createGraphics();
            graphic.drawImage(image, 0, 0, Color.WHITE, null);
            graphic.dispose();

            File output = new File("C:\\Users\\iranjo_sd2082\\Desktop\\flower2.png");
            ImageIO.write(result, "png", output);

        }  catch (IOException e) {
            e.printStackTrace();
        }

    
   }

   static public void main(String args[]) throws Exception {
       ConvertBlackWhite obj = new ConvertBlackWhite();
   }}