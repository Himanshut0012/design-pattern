package solidPrinciple.Single_Responsible;

public class InvoiceDAO {

	Invoice invoice;

	public InvoiceDAO(Invoice invoice) {
		super();
		this.invoice = invoice;
	}

	public void saveToDB() {
		System.out.println("save in database...");
	}
}
