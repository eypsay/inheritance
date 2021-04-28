package inheritance;

public class CustomerManager {
//Customer onu extend eden sýnýflarýn refaranslarýný tutabilir.Buna polimorfizm denir
	public void add(Customer customer) {
		System.out.println(customer.customerNumer+" kaydedildi!");
	}
	//bulk operasyonu denir
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
	
}
