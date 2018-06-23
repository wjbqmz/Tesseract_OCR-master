package Util;

import java.io.File;

public class CreateFileUtil {
	/** 
	 *将切割好要识别的图片保存在一个临时文件夹中
	 * @Date 2018年6月9 日
	 * @motto 辅助工具类-存储切割图片
	 * @Version 1.0 
	 */
	public static void createFile(String Savepath)
	{
	    new File(Savepath).mkdirs();
	}

}
