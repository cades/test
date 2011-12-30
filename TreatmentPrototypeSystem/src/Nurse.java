import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.event.*;
public class Nurse extends JFrame {
	LoginFrame loginFrame;
	JButton actionButton,logoutButton;
	public Nurse(LoginFrame loginFrame){
		this.loginFrame = loginFrame;
		this.setTitle("�@�h�M��");
		actionButton = new JButton("�ʧ@");
		logoutButton = new JButton("�n�X");
		
		actionButton.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        button_actionPerformed(e);
		      }
		   	});
		logoutButton.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        button_actionPerformed(e);
		      }
		    });
		this.add(actionButton,BorderLayout.NORTH);
		this.add(logoutButton,BorderLayout.CENTER);
		
		this.setSize(500,200);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    Dimension dialogSize = this.getSize();
	    if(dialogSize.height > screenSize.height)
	    	dialogSize.height = screenSize.height;
	    if(dialogSize.width > screenSize.width)
	    	dialogSize.width = screenSize.width;
	    this.setLocation( (screenSize.width - dialogSize.width)/2 ,(screenSize.height - dialogSize.height)/2 );
		this.setVisible(true);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void printPrescriptions (){
		System.out.println("[�@�h] �C�L�ĳ�");
	}
	public void makeInspection(){
		System.out.println("[�@�h] �w���ˬd�{��");
	}

	public void logout(){
		this.dispose();
		new LoginFrame();
	}
	private void button_actionPerformed(ActionEvent e) {
	    if (e.getSource().equals(actionButton)) {
	    	printPrescriptions();
	    	makeInspection();
	    }else if (e.getSource().equals(logoutButton)) {
	    	logout();
	    }
	}
	
}