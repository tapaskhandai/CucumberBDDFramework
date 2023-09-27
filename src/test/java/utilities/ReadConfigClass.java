package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigClass {

	public Properties readProperty;

	public void setUpProperties() {

		try {
			FileInputStream fis = new FileInputStream("config.properties");
			readProperty = new Properties();
			readProperty.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public String broswerName() {

		return readProperty.getProperty("broswer");
	}

	public String getUrl() {
		
		return readProperty.getProperty("url");
	}

}
