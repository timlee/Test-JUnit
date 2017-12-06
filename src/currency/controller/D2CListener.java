/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import model.Currency;

/**
 *
 * @author 
 */
public class D2CListener implements ActionListener{
    
private JTextField txtAmount, txtresult;

private double amount;
private String result;
private Currency currency;


    public D2CListener(JTextField txtAmount, JTextField txtresult) {
        this.txtAmount = txtAmount;
        this.txtresult = txtresult;
        
        currency = new Currency();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    amount = Double.parseDouble(txtAmount.getText());
    result = currency.convertD2C(amount);
    txtresult.setText(result);
      
    }
    
}
