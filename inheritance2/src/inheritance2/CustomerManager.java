package inheritance2;

public class CustomerManager {
public void add(Logger logger ) {
	//Musteri eklem kodlar�
	System.out.println("Musteri Eklendi!!!");
	
	logger.log();
	
	
			
 //i� yaapn s�nflara somut s� n�f denir
//i� yapan kodun i�inde ba�ka bir i� yaapn s�n�f kulln�lmaz!!!!
			///HATALI YAPI
			///DatabaseLogger databaseLogger= new DatabaseLogger();
			///databaseLogger.log();
}
}
