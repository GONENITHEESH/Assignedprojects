package Assistedpracticeproject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Rwappendfile21 {
	
	// Write program to read,write and append a file


		public void writeOrAppendDataIntoFile() {
			FileWriter fstream = null;
			try {
				fstream = new FileWriter("D:\\Users\\newfile.txt", true);
				BufferedWriter fbw = new BufferedWriter(fstream);
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter the fileData");
				String s = sc.nextLine();
				fbw.write(s);
				fbw.newLine();
				fbw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		public void readFileData() {

			try {
				BufferedReader in = new BufferedReader(new FileReader("D:\\Users\\newfile.txt"));
				String str;

				while ((str = in.readLine()) != null) {
					System.out.println(str);
				}
				System.out.println(str);
			} catch (IOException e) {
			}

		}
		public static void main(String[] args) {

			Rwappendfile21 object = new Rwappendfile21();
			object.writeOrAppendDataIntoFile();
			object.readFileData();

		}
	}


