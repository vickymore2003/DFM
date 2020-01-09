package utilites;

import java.io.FileReader;
import java.util.Properties;

public class ReadProperty {
	public String getProp(String k) {
		StartUpInitilize start = new StartUpInitilize();
		Properties prop = new Properties();
		String url = null;
		try {
			FileReader fr = new FileReader(System.getProperty("user.dir") + "//src//test//resources//EnvProp//"
					+ start.getEnvName() + ".properties");
			prop.load(fr);
			url = prop.getProperty("url");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return url;
	}
}
