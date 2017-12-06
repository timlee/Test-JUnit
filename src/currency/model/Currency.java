/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency.model;

/**
 *
 * @author 
 */
public class Currency {
    private double amount;
    private String result;

    public Currency() {
    }

   
    public Currency(double amount, String result) {
        this.amount = amount;
        this.result = result;
    }
    
    //Business Logic or Application Logic
    public String convertC2D(double amount){
        this.amount = amount/3.99362;
        result = String.valueOf(this.amount);
       return result ;
    }
    
    public String convertD2C(double amount){
        this.amount = amount * 3.99362;
        result = String.valueOf(this.amount);
       return result ;
    }
    
    
}
