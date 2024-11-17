package collections;

import java.util.*;
import java.util.ArrayList;

class Product{
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name,double price,int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public String getname(){ 
		return name;
	}
	public double getprice() {
		return price;
	}
	public int getquan() {
		return quantity;
	}
	public void setquan(int quantity) {
		this.quantity=quantity;
	}
}

class Inventory{
	private ArrayList<Product> products;
	
	public Inventory() {
		this.products=new ArrayList<>();
	}
	
	public void addProd(Product product) {
		for(Product p: products) {
			if(p.getname().equalsIgnoreCase(product.getname())) {
				p.setquan(p.getquan()+product.getquan());
			}
		}
		products.add(product);
	}
	public void removeItems(String prodname) {
		products.removeIf(p -> p.getname().equalsIgnoreCase(prodname));
	}
	public double total(){
		double  totalval=0;
		for(Product p:products) {
			totalval+=p.getprice()*p.getquan();
			}
		return totalval;
	}
	public void displayitems(){
		System.out.println("Inventory:");
		for(Product p:products) {
			System.out.println("Name: "+p.getname()+",Price: $"+p.getprice()+"Quantity:"+p.getquan());
		}
	}
}

public class InventoryManagementSystem {
 public static void main(String[] args) {
     Inventory in=new Inventory();
     in.addProd(new Product("Apple",0.5,100));
     in.addProd(new Product("Banana",0.3,150));
     in.addProd(new Product("Apple",0.5,50));
     in.addProd(new Product("Orangre",0.2,60));
     
     in.displayitems();
     System.out.println("The total is:"+in.total());
     in.removeItems("Banana");
     in.displayitems();
     System.out.println("The total is:"+in.total());
 }
}
