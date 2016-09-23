package FileReaderTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileInputStream fis = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("1234.txt");
			fis = new FileInputStream("1234.txt");
			fw = new FileWriter(new File("12345678.txt"));
			int data = -1;
			int count = 0;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
				count++;
			}
			
			System.out.println("  count: " + count);
			System.out.println("===============");
			
			// fis 비교
			data = -1;
			count=0;
			while ((data = fis.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			
			System.out.println("  count: " + count);
			System.out.println("===============");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 1.8에서 자동으로 닫아준다네 ;;;;
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
