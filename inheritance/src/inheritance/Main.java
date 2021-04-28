package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Customer customer = new Customer();
//		customer.id = 1;
//		customer.firstName = "Eyyüp";
//		customer.lastName = "Sayýlýr";
//		customer.nationalIdentity = "123";
//		customer.companyName = "";
		IndvidualCustomer eyyup = new IndvidualCustomer();
		eyyup.customerNumer = "12345";

		CorporateCustomer sayilirCorp = new CorporateCustomer();
		sayilirCorp.customerNumer = "78910";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumer = "999";

		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(eyyup);
//		customerManager.add(sayilirCorp);
//		customerManager.add(abc);
//		
		Customer[] customers = { eyyup, abc, sayilirCorp };
		customerManager.addMultiple(customers);

	}

}
