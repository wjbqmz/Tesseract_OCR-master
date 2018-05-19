package Util;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
/** 
 * ͼƬ��ɫ
 *  
 * @author mhh
 * @Date 2017��4��28��
 * @motto ����������-ͼƬ��ɫ
 * @Version 1.0 
 */  

public class ImgInverseUtil {

    public static BufferedImage img_inverse(BufferedImage imgsrc) {
        try {
            //����һ������͸���ȵ�ͼƬ
            BufferedImage back=new BufferedImage(imgsrc.getWidth(), imgsrc.getHeight(),BufferedImage.TYPE_INT_RGB);
            int width = imgsrc.getWidth();  
            int height = imgsrc.getHeight();  
            for (int i = 0; i < height; i++) { 
                for (int j = 0; j < width; j++) {  
                    int pixel = imgsrc.getRGB(j, i); 
                    back.setRGB(j,i,0xFFFFFF-pixel);
                }
            }
            return back;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    //��ȡͼƬ
    public static BufferedImage file2img(String imgpath) {
        try {
            BufferedImage bufferedImage=ImageIO.read(new File(imgpath));
            return bufferedImage;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    //����ͼƬ,extentΪ��ʽ��"jpg"��"png"��
    public static void img2file(BufferedImage img,String extent,String newfile) {
        try {
            ImageIO.write(img, extent, new File(newfile));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {  
        
      
   
     }  

}
