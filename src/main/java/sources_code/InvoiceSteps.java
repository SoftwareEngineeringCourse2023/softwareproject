package sources_code;



public class InvoiceSteps {
	private static  boolean INVOICE = false;
	private static  boolean ISDISCOUNT = false;

	Customersteps o=new Customersteps();
	static LoginSteps  log= new LoginSteps();
	ProdectSteps prod=new ProdectSteps();
	
	
	public boolean isgenerate() {
		return INVOICE;
	}
	
	public void setisgenerate(boolean invoice) {
		InvoiceSteps.INVOICE=invoice;
	}
	
	public boolean getdiscount() {
		return ISDISCOUNT;
	}
	
	public void setdiscount(boolean isdiscount) {
	    throw new UnsupportedOperationException("Cannot modify final field isdiscount.");
	}
}




