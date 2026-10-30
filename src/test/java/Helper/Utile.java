package Helper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Utile { 
	public static String getProperty(String property) throws Exception {
		InputStream input = new FileInputStream("src\\test\\resources\\Properties\\property");
		
		Properties properties = new Properties();
		
		properties.load(input);
		
		return(properties.getProperty(property));
		
	} 

}
