
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class CustomerDetails takes basic customer details as input from the Manager
 * @author Aditi Killekar
 */
class CustomerDetails {
    
    /**
     * This method reads Customer Name by the parameter i
     * @param i The Customer Name
     * @return Name of the customer
     */
    static String getCustomerName(String i) {
     return i;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * This method reads Customer Phone number by the parameter string
 * @param str The customer phone number
 * @return A customer phone number
 * @throws CustomerDetails.invalidStringLengthException 
 */
    String getCustomerPhone(String str) throws invalidStringLengthException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(str.length()!=10)
            throw new invalidStringLengthException();
        else 
            return str;
    }
/**
 * Is the user defined Exception class that extends the main class Exception
 */
    class invalidStringLengthException extends Exception {

     invalidStringLengthException() {
        super();
    }
    
}
}

/**
 * This class keeps track of all the Item details like the item name,code,unit price,
 * The class also takes the quantity of each item calculates the SubTotal bill 
 * @author Aishwarya N D
 */

class ItemProcessing{
    
    /**
     * This method prints the Item code
     * @param i is the index of the item
     * @return code of the item
     */

     int printCode(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return i;
    }
    
  /**
     * This method prints the Item Name
     * @param i is the code of the item
     * @return Name of the item with code i
     */
     
     String printItemName(int i) {
        String[] itemName=new String[10];
        if(i==0)
            itemName[0]="--Lemon Coriander Soup--";
        else if(i==1)
            itemName[1]="--Manchow Soup----------";
        else if(i==2)
            itemName[2]="--Paneer Chilly---------";
        else if(i==3)
            itemName[3]="--Paneer Sizzling-------";
        else if(i==4)
            itemName[4]="--Paneer Sautte---------";
        else if(i==5)
            itemName[5]="--Veg Crunchy-----------";
        else if(i==6)
            itemName[6]="--Manchurian Noodles----";
        else if(i==7)
            itemName[7]="--BabyCorn Manchurian---";
        else if(i==8)
            itemName[8]="--Fried Rice------------";
        else if(i==9)
            itemName[9]="--Schezwan Rice---------";

        
        
        return itemName[i];
    }
     
      /**
     * This method prints the Item's Unit Price
     * @param i is the code of the item
     * @return Unit Price of the item with code i
     */

     int printUnitPrice(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     int[] unitPrice=new int[10];
        if(i==0)
            unitPrice[0]=115;
        else if(i==1)
            unitPrice[1]=105;
        else if(i==2)
            unitPrice[2]=120;
        else if(i==3)
            unitPrice[3]=130;
        else if(i==4)
            unitPrice[4]=150;
        else if(i==5)
            unitPrice[5]=100;
        else if(i==6)
            unitPrice[6]=110;
        else if(i==7)
            unitPrice[7]=120;
        else if(i==8)
            unitPrice[8]=120;
        else if(i==9)
            unitPrice[9]=200;
         
        
        return unitPrice[i];   
    }
    
     /**
      * this method gets the item quantity from the user
      * @param i Item code
      * @param j Item quantity
      * @return Item Quantity
      */
    static int getQuantity(int i,int j) {
        return j;
    }
    
    /**
     * This method prints the SubTotal bill of the specified item
     * @param i Item Code
     * @param j Item Quantity
     * @param unitPrice is the unit price of the item with code i
     * @return SubTotal bill of item with code i
     */
    static int printSubTotal(int i,int j,int unitPrice){
        return j*unitPrice;
    }
}

 
    /**
     * This class calculates the totalBill
     * @author ShreshtaSP
     */

 class OrderSummary{

/**
 * Calculates the total bill
 * @param x Array of subTotal bills of all the items ordered
 * @return  The Total bill
 */
     
    int orderTotal(int[] x) {
        //int billTotal=0;
        int billTotal=0,i;
        for(i=0;i<10;i++){
            billTotal+=x[i];
        }
        return billTotal;
     }

 }
/**
 * This class holds the main method where all the member methods of rest of the classes are accessed
 * @author ShreshtaSP
 */

class Demo{
    /**
     * main method accesses all the methods from rest of the classes
     * @param args 
     */
    public static void main(String[] args) {
        int i;
        CustomerDetails cd=new CustomerDetails();
        ItemProcessing I =new ItemProcessing();
        OrderSummary os=new OrderSummary();
        Scanner in=new Scanner(System.in);
        
        System.out.println("CUSTOMER DETAILS");
        System.out.println("Enter Customer Name:");
        String name=cd.getCustomerName(in.nextLine());
        System.out.println("Enter Customer Phone Number:");
        String phoneNum=cd.getCustomerName(in.nextLine());
        
        System.out.println("+-------------+------------------------+----------------+");
        System.out.println("|----------THE MENU DETAILS ARE AS FOLLOWS--------------|");
        System.out.println("+-------------+------------------------+----------------+");
        System.out.println("|--Item Code--|-------Item Type--------|---Unit Price---|");
        System.out.println("+-------------+------------------------+----------------+");
        for(i=0;i<10;i++)
        {
            
            System.out.print("|------"+I.printCode(i)+"------+"+I.printItemName(i)+"+------"+I.printUnitPrice(i)+"-------|");
            System.out.print("\n");
        }
        System.out.println("+-------------+------------------------+----------------+");
        
       
        int[] itemQuant=new int[10];
        int[] subTotalbill=new int[10];
        int totalBill=0;
        System.out.println("\n\nEnter the Quantity of the Food Ordered for the following Item codes:");
        for(i=0;i<10;i++)
        {
            System.out.print("Code "+i+":");
            int n=in.nextInt();
            itemQuant[i]=I.getQuantity(i,n);
            System.out.print("");
            
            subTotalbill[i]=I.printSubTotal(i,itemQuant[i],I.printUnitPrice(i));
            
        }
        System.out.print("\n");
        System.out.print("\n");
        
        
        
        System.out.println("+-------------+------------------------+----------------+--------------------+---------------+");
        System.out.println("|------------------------------THE SYSTEM GENERATED BILL IS----------------------------------|");
        System.out.println("+-------------+------------------------+----------------+--------------------+---------------+");
        System.out.println("|--Item Code--|-------Item Type--------|---Unit Price---|--Quantity Ordered--|---Sub Total---|");
        System.out.println("+-------------+------------------------+----------------+--------------------+---------------+");
        for(i=0;i<10;i++)
        {
            if(itemQuant[i]>0){
                System.out.print("|------"+I.printCode(i)+"------+"+I.printItemName(i)+"+------"+I.printUnitPrice(i)+"-------|---------"+itemQuant[i]+"----------|------"+subTotalbill[i]+"------|");
                System.out.print("\n");
            }
        }
        System.out.println("+-------------+------------------------+----------------+--------------------+---------------+");
        System.out.println("|------------------------------------------------------------ORDER TOTAL-----+-------"+os.orderTotal(subTotalbill)+"----|");
        System.out.println("+-------------+------------------------+----------------+--------------------+---------------+");
        System.out.print("\n");
        System.out.println("THANK YOU MR/MISS "+name+".... VISIT AGAIN...");
        
        System.exit(0);
      
    }
}
 


