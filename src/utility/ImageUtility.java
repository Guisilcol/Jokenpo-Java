package utility;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Class containing some functions for the manipulation of images
 * @author guilherme
 * 
 */
public class ImageUtility {
    /**
     * Returns an ImageIcon object with the height and width of the JLabel reported.
     * @param imgPath Image path
     * @param label JLabel that will be used. 
     * @return ImageIcon with JLabel height and width
     */
    public static ImageIcon newJLabelWallpaper(String imgPath, JLabel label){
        
        ImageIcon rawImg = new ImageIcon(imgPath);
        Image img = rawImg.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                 
        ImageIcon newIcon = new ImageIcon(newImg);
        return newIcon;
    }
    
    
}
