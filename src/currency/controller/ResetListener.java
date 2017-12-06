/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class ResetListener implements ActionListener{
private JTextField txtAmount, txtresult;

    public ResetListener(JTextField txtAmount, JTextField txtresult) {
        this.txtAmount = txtAmount;
        this.txtresult = txtresult;
    }
    
    
    public void actionPerformed(ActionEvent e) {
        txtAmount.setText("");
        txtresult.setText(null);
        
    }
    
}
