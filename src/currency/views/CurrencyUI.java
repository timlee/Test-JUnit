/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency.views;

import controller.C2DListener;
import controller.D2CListener;
import controller.ResetListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author khaynay
 */
public class CurrencyUI extends JFrame{
    private JPanel pnlMain;
    private JLabel lblAmount, lblResult ;
    private JTextField txtAmount, txtResult ;
    private JButton btnC2D, btnD2C, btnReset;
    
    private C2DListener  c2DListener;
    private D2CListener d2CListener;
    private ResetListener resetListener;
   // private Currency currency;
    
    
    public CurrencyUI(){
        super("Class Currency Trial");
        
       pnlMain = new JPanel();
       lblAmount = new JLabel("Input Amount to convert: ");
       lblResult = new JLabel("Result: ");
       txtAmount = new JTextField(30);
       txtResult =  new JTextField(30);
       txtResult.setEditable(false);
       btnC2D = new JButton("Convert Cedis to Dollars");
       btnD2C = new JButton("Convert Dollars to Cedis");
       btnReset = new JButton("Clear Fields");
       
       c2DListener = new C2DListener(txtAmount, txtResult);
       d2CListener= new D2CListener(txtAmount, txtResult);
       resetListener=new ResetListener(txtAmount, txtResult);
       
       btnC2D.addActionListener(c2DListener);
       btnD2C.addActionListener(d2CListener);
       btnReset.addActionListener(resetListener);
           
       
       
       pnlMain.add(lblAmount);
      pnlMain.add(txtAmount); 
      pnlMain.add(lblResult);
       pnlMain.add(txtResult);
       
       pnlMain.add(btnC2D);
       pnlMain.add(btnD2C);
       pnlMain.add(btnReset);
       
       
       
        this.add(pnlMain);
        this.setSize(500,500);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    }
    
    
    public static void main(String[] args) {
        new CurrencyUI();
    }
}
