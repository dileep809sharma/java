package EncryptDecrypt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Decrypt {
	int ch = 0;
	public void decrypt() throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\dilip\\Desktop\\file_encrypt.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\dilip\\Desktop\\file_decrypt.txt");
		
		
		while((ch=fis.read()) != -1) {
			if(ch=='c' || ch=='g' || ch=='k' || ch=='q' || ch=='w') {
				ch = ch-2;
				fos.write(ch);
			}
			else {
				ch--;
				fos.write(ch);
			}
			
		}
	fos.close();
	fis.close();
	System.out.println("file decrypted");
	
	}
}
