package sources_code;



public class InvoiceSteps {
	public static final boolean INVOICE = false;
	public static final boolean isdiscount = false;

	Customersteps o=new Customersteps();
	static LoginSteps  log= new LoginSteps();
	ProdectSteps prod=new ProdectSteps();
	
	
	public boolean isgenerate() {
		return INVOICE;
	}
	
	public void setisgenerate(boolean invoice) {
	    throw new UnsupportedOperationException("Cannot modify final field INVOICE.");
	}
	
	public boolean getdiscount() {
		return isdiscount;
	}
	
	public void setdiscount(boolean isdiscount) {
	    throw new UnsupportedOperationException("Cannot modify final field isdiscount.");
	}
}




