package inheritance2;

public class LogManager {
	public void log(int logType) {
		if (logType == 1) {
			System.out.println("database loglandý");
		} else if (logType == 2) {
			System.out.println("file loglandý");
		} else {
			System.out.println("maile loglandý");
		}
	}
	// bu yapýyý enum ile kururup
	// 1-database
	// 2- file
	// 3- email

}
