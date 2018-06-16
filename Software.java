/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.util.Scanner;

/**
 *
 * @author Abdo elnomrosy
 */
public class Software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String in;
         int id;
         Scanner input=new Scanner (System.in);
                NewClass  p1 =new NewClass (0,17,"p1",0);
		NewClass  p2 =new NewClass (2,6,"P2",1);
		NewClass  p3 =new NewClass (5,11,"p3",7);
		NewClass  p4 =new NewClass (15,4,"p4",9);
                NewClass1 c=new NewClass1 ();
                c.addProcess(p1);
                 c.addProcess(p2);
                  c.addProcess(p3);
                   c.addProcess(p4);
                    c.addProce(0);
                 c.addProce(2);
                  c.addProce(5);
                   c.addProce(15);
                   System.out.println("if you want to show the details of a specific product write show else if you want to show all products write view if you want to buy write buy  ");
              in=input.nextLine();
              if(in.equals("buy")){
                  c.check();
                  
              }
              else if(in.equals("view")){
                   c.print();
              }
              else if(in.equals("show")){
                  System.out.println("enter the product place for product you want to show");
                  id=input.nextInt();
                  c.show(id);
              }
              else{
                 
                  System.out.println("your input is not valid");
              }
              
                
    }
    
}
