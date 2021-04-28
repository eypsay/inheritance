package inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// biriirini alternatifi olan codelar icin if yazýlamaz
		// HAATLI YAPI
		LogManager logManager=new LogManager();
		logManager.log(3);
		
		
		//DOGRU YAPI
		CustomerManager customerManager= new CustomerManager();
		customerManager.add(new DatabaseLogger());
	
	}

}
