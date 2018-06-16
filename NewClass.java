/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

/**
 *
 * @author Abdo elnomrosy
 */
public class NewClass {
      public int productid,quantity;
	public double price;
	
	public String productname;
        public NewClass(int productid2,double price2, String nae,int gg){
		productid = productid2;
		price = price2;
		productname = nae;
                quantity=gg;
		
	}

	// Get the arrive time value
	public int getproduct(){
		return productid;
	}

	// Set the arrive time value
	public void setproduct(int productid2){
		productid = productid2;
	}

	// Get the burst time value
	public double getBurstTime(){
		return price;
	}
       
	// Set the burst time value
	public void setprice(double price2){
		price= price2;
	}

	// Get the process name
	public String getName(){
		return productname;
	}

	// Set the process name
	public void setName(String nae){
		productname =nae;
	}
        
        
        
        
        public int getme(){
		return quantity;
	}

	// Set the process name
	public void setme(int gg){
		quantity =gg;
	}
        
    
}
