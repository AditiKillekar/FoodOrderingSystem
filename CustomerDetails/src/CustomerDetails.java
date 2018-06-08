/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
class CustomerDetails {
    static String getCustomerName(String i) {
     return i;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getCustomerPhone(String string) throws invalidStringLengthException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(string.length()!=10)
            throw new invalidStringLengthException();
        else 
            return string;
    }

    class invalidStringLengthException extends Exception {

     invalidStringLengthException() {
        super();
    }
    
}
}
