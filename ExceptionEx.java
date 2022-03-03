package com.cts.oops2;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionEx {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("d:\\shekhar\\march3.txt");

			fw.write("Welcome to Java IO");
			System.out.println("success");
		} catch (IOException e) {

		} finally {
			try {
				fw.close();
			} catch (IOException e) {

			}
		}

	}
}
