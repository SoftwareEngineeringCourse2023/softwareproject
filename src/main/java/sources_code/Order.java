package sources_code;

import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;

public class Order {
	
    private static final Logger LOGGER = Logger.getLogger(Order.class.getName());

	Customersteps c =new Customersteps();
	 private String category;
	private int id;
	private String name;
	private String picture;
	private String description;
	private double price;
	private String material;
	private String cleaninig;
	private int quantity;
	private int identifier;
	public Order(){}
		public Order(int identifier,String category,int id,String name, String picture, String description, double price, String material, String cleaninig,int quantity) {
	    	this.setidentifier(identifier);
			this.setCategory(category);
	    	this.setId(id);
	    	this.setName(name);
	    	this.setPicture(picture);
	    	this.setDescription(description);
	    	this.setPrice(price) ;
	    	this.setMaterial(material);
	    	this.setCleaninig(cleaninig);
	    	this.setQuantity((quantity));
	    	
		}
		public final List<Order> or=new ArrayList<Order>();
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPicture() {
			return picture;
		}
		public void setPicture(String picture) {
			this.picture = picture;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getidentifier() {
			return identifier;
		}
		public void setidentifier(int iD) {
			identifier = iD;
		}
		public int printidentifier() {
			LOGGER.info(String.format("ID: %s ", identifier));
			return identifier;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getCleaninig() {
			return cleaninig;
		}
		public void setCleaninig(String cleaninig) {
			this.cleaninig = cleaninig;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		
		public String printcat() {
			LOGGER.info(String.format("Category product: %s " , category ));
			return category;
		}
		
		public int printid() {
			LOGGER.info(String.format("Id  product: %s  ",getId() ));
			return id;
		}
		
		public String printname() {
			LOGGER.info(String.format("Name product: %s",name));
			return name;
		}
		
		public String printpic() {
			LOGGER.info(String.format("Link for Picture product: %s ",picture));
			return picture;
		}
		public String printdisc() {
			LOGGER.info(String.format("The discription : %s ",description));
			return description;
		}
		
		public double printprice() {
			LOGGER.info(String.format("The price :  ",price));
			return price;
		}
		
		public String printmt() {
			LOGGER.info(String.format("The Material: %s ",material));
			return material;
		}
		
		public String printcln() {
			LOGGER.info(String.format("The type cleaning : %s ",cleaninig));
			return cleaninig;
		}
		
		public int printquan() {
			LOGGER.info(String.format("The Quantity : ",quantity));
		

			return quantity;
		}
		
		
		
		public void printorder() {
			 printidentifier();
			 printcat();
			 printid();
			 printname();
			 printpic();
			 printdisc();
			 printprice();
			 printmt();
			 printcln();
			 printquan();
			
			 LOGGER.info("\n" );

		}
		
}
