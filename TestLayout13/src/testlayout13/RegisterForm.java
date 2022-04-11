/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlayout13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Acer
 */
//RegisterForm
public class RegisterForm extends JFrame implements ActionListener {
        private JButton bt1, bt2;
	private JTextField tf1, tf2, tf3;
	private double result;
	private Container cont;
	private JPanel panel1, panel2;
	public RegisterForm(String s)
	{ 
		super(s);
		cont = this.getContentPane();
		JLabel num1lb = new JLabel("User name: ");
		tf1 = new JTextField();
		JLabel num2lb = new JLabel("Password: ");
		tf2 = new JTextField();
		JLabel resultlb = new JLabel("Confirm password: ");
		tf3 = new JTextField();
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3,2));
		panel1.add(num1lb); 
		panel1.add(tf1); 
		panel1.add(num2lb); 
		panel1.add(tf2);
		panel1.add(resultlb);
		panel1.add(tf3);
		bt1 = new JButton("Login");
		bt2= new JButton("Register");
		panel2 = new JPanel();
		panel2.add(bt1);
		panel2.add(bt2);
		cont.add(panel1); 
		cont.add(panel2,"South"); 
		bt1.addActionListener(this);
		bt2.addActionListener(this); 
		this.pack();
		this.setVisible(true);
	}
	
	/*Định nghĩ lại hàm xử lý khi người dùng ấn các nút phép toán*/
	public void actionPerformed(ActionEvent e) 
	{ 
	
	}	
	public static void main(String args[])
	{
		/*Tạo giao diện chương trình*/
		RegisterForm registerForm = new RegisterForm("Register Form ");
		registerForm.setLocationRelativeTo(null);
	}
}