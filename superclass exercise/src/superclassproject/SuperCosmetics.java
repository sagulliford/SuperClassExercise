package superclassproject;
/*
 * Super Class Method
 */
import java.util.Scanner;

public class SuperCosmetics {
		private static final String name = "Cosmetics";//will always be Cosmetics, can't be changed
		public String brand;
		public String product;
		public String price;
		public static Scanner myscan = new Scanner(System.in);
		
	public SuperCosmetics(){
		brand = "Brand Name";
		product = "Product Name";
		price = "Prcie";
	}
		
	public String getname(){
		return(name);
	}
	
	
	public String getbrand(){
		return(brand);
	}
	
	public String getproduct(){
		return(product);
	}
	
	public String getprice(){
		return(price);
	}
	
	public String setbrand() {
		System.out.println ("Enter a Product Brand:");
		brand = myscan.next(); //myscan.close();
		return brand;
	}
	
	public String setproduct() {
		System.out.println ("Enter the Product:");
		product = myscan.next(); //myscan.close();
		return product;
	}
	
	public String setprice() {
		System.out.println ("Enter the Product Price:");
		price = myscan.next(); //myscan.close();
		return price;
	}
}
