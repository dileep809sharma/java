package EncryptDecrypt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encrypt {
	int ch=0;
	public void encrypt() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\dilip\\Desktop\\file.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\dilip\\Desktop\\file_encrypt.txt");
		
		while((ch=fis.read()) != -1) {
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				ch=ch+2;
				fos.write(ch);
			}
			else {
				ch++;
				fos.write(ch);
			}
			
		}
		fos.close();
		fis.close();
		System.out.println("file encrypted");
	}
}
