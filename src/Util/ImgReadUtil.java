package Util;
import java.io.File;  
import java.util.ArrayList;  
import java.util.List;  

import javax.swing.JOptionPane;
  
/** 
 * �ݹ��ȡĳ��Ŀ¼�µ������ļ� 
 *  
 * @author mhh
 * @Date 2017��4��18��
 * @motto ����������-��ȡ�ļ�
 * @Version 1.0 
 */  
public class ImgReadUtil {  
    public static File[] myreader(String fileDir) {  
		// TODO Auto-generated method stub
        List<File> fileList = new ArrayList<File>();  
        File file = new File(fileDir);  
        File[] files = file.listFiles();// ��ȡĿ¼�µ������ļ����ļ���  
        if (files == null) {// ���Ŀ¼Ϊ�գ�ֱ���˳�  
        	JOptionPane.showMessageDialog(null, "��Ŀ¼��û���ļ� ", "���� ", JOptionPane.ERROR_MESSAGE);
        }  
        // ������Ŀ¼�µ������ļ�  
        for (File f : files) {  
            if (f.isFile()) {  
                fileList.add(f);  
            } else if (f.isDirectory()) {  
                System.out.println(f.getAbsolutePath());  
                myreader(f.getAbsolutePath());  
            }  
        }  
        return files;
    }

	}  

