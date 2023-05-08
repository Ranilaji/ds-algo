package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	
	private static Properties prop;
	private final static String propertyFilePath = "C:\\Users\\umara\\eclipse-workspace\\ds_algo\\src\\test\\resources\\config\\config.properties";
	private static String browser = null;
	private static String browserType = null;

	public static void loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			prop = new Properties();
			try {
				prop.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	
	public static void setBrowserType(String browser) {
		browserType = browser;
	}
	
	public static String getBrowserType() {
		browser = prop.getProperty("browser");
		
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}

		public static String getApplicationUrl() {
			String url = prop.getProperty("url");
			return url;
		}
		public static String getHomePage() {
			String homepageurl = prop.getProperty("homepageurl");
			return homepageurl;
		}
		public static String getRegisterPage() {
			String registerpageurl = prop.getProperty("registerpageurl");
			return registerpageurl;
		}
		public static String getSignInPage() {
			String signinpageurl = prop.getProperty("signinpageurl");
			return signinpageurl;
		}
		
		public static String getExcelFilePath() {
			String excelpath = prop.getProperty("excelpath");
			if (excelpath != null)
				return excelpath;
			else
				throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
		}
		
		public static String getTimeComplexityPage() {
			String timecomplexityurl = prop.getProperty("timecomplexityurl");
			return timecomplexityurl;
		}
		
		public static String arrayUrl() {
			String url = prop.getProperty("Array");
			if (url != null)
				return url;
			else
				throw new RuntimeException("URL is not specified in the Configuration.properties file.");
		}
		
		public static String arraysInPythonUrl() {
			String url = prop.getProperty("ArraysInPython");
			if (url != null)
				return url;
			else
				throw new RuntimeException("URL is not specified in the Configuration.properties file.");
		}	
		
		public static String arraysUsingListUrl() {
			String url = prop.getProperty("ArraysUsingList");
			if (url != null)
				return url;
			else
				throw new RuntimeException("URL is not specified in the Configuration.properties file.");
		}	
		
		public static String basicOperationsUrl() {
			String url = prop.getProperty("BasicOperationsList");
			if (url != null)
				return url;
			else
				throw new RuntimeException("URL is not specified in the Configuration.properties file.");
		}
		
		public static String appOfArrayUrl() {
			String url = prop.getProperty("ApplicationsOfArray");
			if (url != null)
				return url;
			else
				throw new RuntimeException("URL is not specified in the Configuration.properties file.");
		}	
		public static String tryEditorUrl() {
			String url = prop.getProperty("TryEditor");
			if (url != null)
				return url;
			else
				throw new RuntimeException("URL is not specified in the Configuration.properties file.");
		}	
		public static String stackUrl() {
			String url = prop.getProperty("Stack");
			if (url != null)
				return url;
			else
				throw new RuntimeException("URL is not specified in the Configuration.properties file.");
		}
		public static String graphUrl() {
			String url = prop.getProperty("Graph");
			if (url != null)
				return url;
			else
				throw new RuntimeException("URL is not specified in the Configuration.properties file.");
		}
		public static String arrayPracQuestions() {
			String url = prop.getProperty("PracQuestions");
			if (url != null)
				return url;
			else
				throw new RuntimeException("URL is not specified in the Configuration.properties file.");
		}
}

	

