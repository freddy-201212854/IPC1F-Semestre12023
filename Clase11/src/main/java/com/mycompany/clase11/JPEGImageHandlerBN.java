package com.mycompany.clase11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author josed
 */
public class JPEGImageHandlerBN extends ImageHandler {
    String nombreCorto;
    BufferedImage jpg = null;
    BufferedImage bmp = null;
    File bmpTemporal;

    public JPEGImageHandlerBN(String filename) {
        super(filename); 
        
        File f = new File(getFileName());
        this.nombreCorto = FilenameUtils.removeExtension(f.getName());
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        jpg = ImageIO.read(file);
        bmpTemporal =  new File("./bmpTemporal.bmp");
        ImageIO.write(jpg, "bmp", bmpTemporal); 
        bmp = ImageIO.read(bmpTemporal);
    }

    @Override
    public void generateFiles() throws Exception {
        for (int x = 0; x < bmp.getWidth(); x++) {
            for (int y = 0; y < bmp.getHeight(); y++) {  
                Color color = new Color(bmp.getRGB(x, y)); 
                int promedio = (color.getBlue() + color.getGreen() + color.getRed())/3;
                Color newColor = new Color(promedio, promedio, promedio);
                bmp.setRGB(x, y, newColor.getRGB());
            }
        }
        
        ImageIO.write(bmp, "jpg", new File("./BN-" + nombreCorto + ".jpg"));           
        bmpTemporal.delete();
    }
}
