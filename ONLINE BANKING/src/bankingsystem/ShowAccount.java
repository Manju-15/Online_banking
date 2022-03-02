package bankingsystem;
import java.awt.*;
import java.awt.event.*;
public class ShowAccount extends Bank1 implements ActionListener{
    Frame f3 = new Frame("Account");
    Label l1,l2,l3,l4;
    Button b1;
    ShowAccount(){
    	f3.setBackground(Color.LIGHT_GRAY);
    	b1 = new Button("Cancel");
    	l1 = new Label("====================================================================");
    	l2 = new Label("s.no"+"       "+"Name"+"           "+"Type"+"          "+"Balance" );
    	l3 = new Label("=====================================================================");
    	l4 = new Label("1"+"        "+name+"         "+"savings"+"         "+balance);
    	l1.setBounds(10,50,450,20);
    	l2.setBounds(10,80,450,20);
    	l3.setBounds(10,110,450,20);
    	l4.setBounds(10,150,450,20);
    	b1.setBounds(500,250,50,20);
    	b1.addActionListener(this);
    	f3.add(l1);
    	f3.add(l2);
    	f3.add(l3);
    	f3.add(l4);
    	f3.add(b1);
    	f3.setSize(600,300);
    	f3.setLayout(null);
    	f3.setVisible(true);
    	
    }
    
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			f3.setVisible(false);
			f1.setVisible(false);
			new Bank1();
		}
		
	}
	public static void main(String[] args) {
		new ShowAccount();
	}
}
