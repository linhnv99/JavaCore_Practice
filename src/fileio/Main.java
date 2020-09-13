package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
//		1.File
		
		File file = new File("F:\\demo.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		System.out.println("=====List root");
		File[] listRoot = file.listRoots();// mảng các obj file
		for (File f : listRoot) {
			System.out.println(f.getAbsolutePath());
		}
		
		File root = new File(file.getParent()); // mảng các obj file
		File[] listFiles = root.listFiles();
		System.out.println("=====List of files in "+ file.getParent());
		for(File f : listFiles) {
			System.out.println(f.getName());
		}
		
		String[] listFile = root.list();
		System.out.println("=====List of fileNames in "+ file.getParent());
		for (String string : listFile) {
			System.out.println(string);
		}
		
//		2.Stream
//		FileInputStream : đọc dữ liệu
//		FileOutputStream: ghi dữ liệu
//		FileReader: đọc kí tự
//		FileWriter: ghi kí tự
//		BufferedReader: đọc chuỗi
//		BufferedWriter: ghi chuỗi

		
		
		
		
	}
}
