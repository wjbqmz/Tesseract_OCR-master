package Util;

import java.io.File;

public class CreateFileUtil {
	/** 
	 *���и��Ҫʶ���ͼƬ������һ����ʱ�ļ�����
	 * @Date 2018��6��9 ��
	 * @motto ����������-�洢�и�ͼƬ
	 * @Version 1.0 
	 */
	public static void createFile(String Savepath)
	{
	    new File(Savepath).mkdirs();
	}

}
