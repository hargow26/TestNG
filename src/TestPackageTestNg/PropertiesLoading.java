package TestPackageTestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoading {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Harish Gowda S\\eclipse-workspace\\TestNgProject\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		FileOutputStream fos =new FileOutputStream("C:\\Users\\Harish Gowda S\\eclipse-workspace\\TestNgProject\\src\\data.properties");
		prop.setProperty("url", "https://AgainAwesome.com");
		prop.store(fos, null);
		System.out.println(prop.getProperty("url"));
		
	}

}
