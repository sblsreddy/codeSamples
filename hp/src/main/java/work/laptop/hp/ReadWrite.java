package work.laptop.hp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader in = null;
		FileWriter wr = null;
		try {
			 in = new FileReader(new File("C:/Users/Home/Desktop/reading.txt"));
			 wr = new FileWriter(new File("C:/Users/Home/Desktop/readingwrite.txt"));
			 br = new BufferedReader(in);
			String line = "";
			while( (line = br.readLine()) != null ){
				wr.write(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	         if (in != null) {
	             try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	          }
	          if (wr != null) {
	             try {
					wr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	          }
	       }

	}

}
