/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Abdo elnomrosy
 */
public class NewClass1 {
    private Vector<NewClass> products =new Vector<NewClass>();
    private Vector<Integer> produ =new Vector<Integer>();
    void addProcess(NewClass p){
		products.addElement(p);
		

    }
    void addProce(int r){
		produ.addElement(r);
		

    }
     void print (){
        for(int i=0;i<products.size();i++){
             System.out.println(i+"product information"+"product price is "+ products.elementAt(i).price+"  "+"product id is"+products.elementAt(i).productid+"  "+"product name"+ products.elementAt(i).productname+"product quantity"+products.elementAt(i).quantity);
        }
     }
     void show(int id){
         int u;
         if(produ.contains(id)){
             u=produ.indexOf(id);
             System.out.println("your product infomation"+"product price is "+ products.elementAt(id).price+"  "+"product id is"+products.elementAt(id).productid+"  "+"product name"+ products.elementAt(id).productname+"product quantity"+products.elementAt(id).quantity);
         }
     }

public void check( ){
    Scanner inpu=new Scanner (System.in);
    int cin,numberofthings;
    double card;
  
    int lg;
          
    System.out.println("enter number of things that you want to buy");
     numberofthings=inpu.nextInt();
    
     if(numberofthings==1){
          System.out.println("enter product id ");
     cin=inpu.nextInt();
     System.out.println("enter your balannce");
     card=inpu.nextDouble();
     
         if(produ.contains(cin)){
             int y=produ.indexOf(cin);
            
    
        
        if(products.elementAt(y).productid==cin&&card>=products.elementAt(y).price&&products.elementAt(y).quantity>0){
            card=card-products.elementAt(y).price;
           
            products.elementAt(y).quantity--;
             System.out.println("your product price is "+products.elementAt(y).price);
             System.out.println("tne new balance is"+card);
             System.out.println("the new quantity of this product id "+products.elementAt(y).quantity);
        }
        else if(card<products.elementAt(y).price){
             System.out.println("check your balance as your balance is not enough to buy this product "+""+products.elementAt(y).productname);
        }
        else if(products.elementAt(y).quantity<=0){
            System.out.println("the quantity of this product is not enough to buy this product "+""+products.elementAt(y).productname+"the quantity is"+products.elementAt(y).quantity);
        }
       
    }
     
    else{
            System.out.println("check  your product id");
        }
            
}
     
else if(numberofthings!=1){
    System.out.println("enter your balannce");
     card=inpu.nextDouble();
    while(numberofthings>0){
        System.out.println("enter product id ");
     cin=inpu.nextInt();
      
     
        if(produ.contains(cin)){
            
              int y=produ.indexOf(cin);
             System.out.println(y+"MN");
    
        
        if(products.elementAt(y).productid==cin&&card>=products.elementAt(y).price&&products.elementAt(y).quantity>0){
            card=card-products.elementAt(y).price;
            products.elementAt(y).quantity--;
             System.out.println("your product price is "+products.elementAt(y).price);
             System.out.println("tne new balance is"+card);
              System.out.println("the new quantity of this product id "+products.elementAt(y).quantity);
        }
         else if(card<products.elementAt(y).price){
             System.out.println("check your balance as your balance is not enough to buy this product "+""+products.elementAt(y).productname);
        }
        else if(products.elementAt(y).quantity<=0){
            System.out.println("the quantity of this product is not enough to buy this product "+""+products.elementAt(y).productname+"the quantity is"+products.elementAt(y).quantity);
        }
        
        }
        else{
            System.out.println("check your balance or your product id"+ "");
        }
        numberofthings--;
    }
    
}
}
}
