package inheritance2;

public class LogManager {
	public void log(int logType) {
		if (logType == 1) {
			System.out.println("database logland�");
		} else if (logType == 2) {
			System.out.println("file logland�");
		} else {
			System.out.println("maile logland�");
		}
	}
	// bu yap�y� enum ile kururup
	// 1-database
	// 2- file
	// 3- email

}
