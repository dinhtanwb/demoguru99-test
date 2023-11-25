package commons;

import java.io.File;

public class GlobalConstance {
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String OS_NAME = System.getProperty("os.name");
	public static final String UPLOAD_FILE = PROJECT_PATH + File.separator +"uploadFiles" + File.separator;
	public static final String FRONT_END_URL = "https://demo.guru99.com/test/upload/";
	public static final String IMAGE = PROJECT_PATH + File.separator +"uploadFiles" + File.separator + "Java.png";
	public static final long SHORT_TIME_OUT = 5;
	public static final long LONG_TIME_OUT = 30;
}
