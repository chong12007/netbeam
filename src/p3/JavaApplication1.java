/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author User
 */
public class JavaApplication1 extends JFrame {
    JPanel textFieldPanel = new JPanel(new GridLayout(2,1));
    JTextField passworField = new JTextField();
    JButton submitBtn = new JButton("Submit");
    JTextField OutpuTextField = new JTextField();

    public JavaApplication1() {
        textFieldPanel.add(new JLabel("Enter your password"));
        textFieldPanel.add(passworField);
        textFieldPanel.add(new JLabel(""));
        
        submitBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Password pw = new Password(passworField.getText());
                    OutpuTextField.setText("Congrats");
                    
                }catch(InvalidPasswordException ex){
                    OutpuTextField.setForeground(Color.red);
                    OutpuTextField.setText("error");
                }
            }
            
        });
        textFieldPanel.add(submitBtn);
        textFieldPanel.add(OutpuTextField);
        
        add(textFieldPanel,BorderLayout.CENTER);
        add(OutpuTextField, BorderLayout.SOUTH);
        
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("password login");
        setVisible(true);
    }
    
    
   
    public static void main(String[] args) {
       JavaApplication1 j1 = new JavaApplication1();
       
    }
    
}
