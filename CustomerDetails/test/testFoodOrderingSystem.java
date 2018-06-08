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
   
    public testFoodOrderingSystem() {
        CustomerDetails cd;
    
    }
    
    @BeforeClass
    public static void setUpClass() {
        CustomerDetails cd=new CustomerDetails();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
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
     
}
