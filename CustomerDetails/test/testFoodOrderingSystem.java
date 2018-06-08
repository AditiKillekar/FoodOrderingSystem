/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class testFoodOrderingSystem {
    CustomerDetails cd;
    ItemProcessing I;
    OrderSummary os;
   
    public testFoodOrderingSystem() {
        CustomerDetails cd;
        ItemProcessing I;
        OrderSummary os;
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        CustomerDetails cd=new CustomerDetails();
        ItemProcessing I =new ItemProcessing();
        OrderSummary os=new OrderSummary();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
     public void testGetCustomerName() {
         assertEquals("aditi",cd.getCustomerName("aditi"));
    }
     
     public void testGetCustomerPhone() {
         try{
            assertEquals("9449605448",cd.getCustomerPhone("9449605448"));
            assertEquals(0,cd.getCustomerPhone("94496058"));
            fail();
         }
 catch (CustomerDetails.invalidStringLengthException ex) {
            //Logger.getLogger(testFoodOrdering.class.getName()).log(Level.SEVERE, null, ex);
        }
     } 
     
     public void testPrintCode(){
         assertEquals(0,I.printCode(0));
     }
     
     public void testPrintItemName(){
         assertEquals("Lemon Coriander",I.printItemName(0));
     }
     
     public void testPrintUnitPrice(){
         assertEquals(115,I.printUnitPrice(0));
     }
     
     public void testPrintSubTotal(){
         assertEquals(230,(I.printSubTotal(0,I.getQuantity(0,2),I.printUnitPrice(0))));
     }
     public void testOrderTotal(){
         int[] a=new int[5];
                 a[0]=1;
                 a[1]=2;
                 a[2]=4;
                 a[3]=10;
                 a[4]=20;
        assertEquals(37,os.orderTotal(a)); 
     }
     
}
