package solidPrinciple.Single_Responsible;

public class InvoicePrint {
	private Invoice invoice;

	public InvoicePrint(Invoice invoice) {
		this.invoice = invoice;
	}

	public void printInvoice() {
		System.out.println("Invoice printing....!");
	}

}
