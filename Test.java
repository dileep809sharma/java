package EncryptDecrypt;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		Encrypt e = new Encrypt();
		Decrypt d = new Decrypt();
		e.encrypt();
		d.decrypt();
	}

}
