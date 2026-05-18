package com.qa.orangeendtoend.configreader;

import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
	public static Properties prop;
	public static String getProperty(String key) throws Exception {
	 prop = new Properties();
	FileInputStream file = new FileInputStream("./src/test/resources/Configfile.properties");
	prop.load(file);
	return prop.getProperty(key);

}
}