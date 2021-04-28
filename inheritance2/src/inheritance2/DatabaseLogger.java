package inheritance2;

public class DatabaseLogger extends Logger {
	@Override
	public void log() {
		// TODO Auto-generated method stub
		super.log();
		System.out.println("Veritabanýna loglandý");
	}
}
