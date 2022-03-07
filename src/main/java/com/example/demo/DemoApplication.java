package com.example.demo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class DemoApplication {

	static {
		Properties props = new Properties();
		try {
			props.load(new InputStreamReader(DemoApplication.class.getResourceAsStream("/version.properties")));
		} catch (IOException e) {
			throw new IllegalStateException();
		}
		System.err.println(props);
	}

	public static void main(String[] args) {
		System.err.println("Hello World");
	}

}
