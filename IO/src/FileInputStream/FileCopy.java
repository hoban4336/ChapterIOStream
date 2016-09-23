package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null; // null�� setting �Ұ�!
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("image.jpg");  //door1
			fos = new FileOutputStream("image_back.jpg");  //door2
			
			int data =-1;
			while((data = fis.read())!= -1){
				fos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("error:" + e);
		} catch(Exception e){
			System.out.println("error:" + e);
		} finally {
			try {
				//null�ΰ��  ������ NullPointException�� �߻��Ѵ�!! �ݵ�� �������! 
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
