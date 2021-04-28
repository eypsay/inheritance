package inheritance2;

public class CustomerManager {
public void add(Logger logger ) {
	//Musteri eklem kodlarý
	System.out.println("Musteri Eklendi!!!");
	
	logger.log();
	
	
			
 //iþ yaapn sýnflara somut sý nýf denir
//iþ yapan kodun içinde baþka bir iþ yaapn sýnýf kullnýlmaz!!!!
			///HATALI YAPI
			///DatabaseLogger databaseLogger= new DatabaseLogger();
			///databaseLogger.log();
}
}
