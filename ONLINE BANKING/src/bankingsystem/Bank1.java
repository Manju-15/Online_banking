package bankingsystem;
import java.awt.*;
import java.awt.event.*;
public class Bank1 extends Bank implements ActionListener{
	Frame f1 = new Frame("Applications");
	Button b1,b2,b3,b4,b5,b6,b7;
	Label l,l1,l2;
	TextField t1;
	Bank1() {
		
		f1.setBackground(Color.LIGHT_GRAY);
		l = new Label("====SELECT YOUR OPTION========");
		l1 = new Label("===============");
		l2 = new Label();
		t1 = new TextField();
		b1 = new Button("Withdraw");
		b2 = new Button("Deposit");
		b3 = new Button("Get Balance");
		b4 = new Button("Display Account");
		b5 = new Button("Bank Interest");
		b6 = new Button("Cancel");
		b7 = new Button("OK");
	    l.setBounds(50,50,200,20);
	    b1.setBounds(25,85,100,20);
	    b2.setBounds(25,130,100,20);
	    b3.setBounds(150,85,100,20);
	    b4.setBounds(150,130,100,20);
	    b5.setBounds(25,170,100,20);
	    b6.setBounds(200,350,50,20);
	    l1.setBounds(80,220,200,20);
	    t1.setBounds(80,250,100,20);
	    b7.setBounds(150,170,100,20);
	    l2.setBounds(80,300,200,20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		f1.add(l);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.add(b6);
		f1.add(l1);
		f1.add(t1);
		f1.add(l2);
		f1.add(b7);
		f1.setSize(300,400);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b6) {
        	balance = 0;
        	f1.setVisible(false);
			new Bank();
		}
		if(e.getSource()==b1) {
	        new Withdraw();
		}
		if(e.getSource()==b2) {
			l1.setText("Enter amount to deposit");
		}
		if(e.getSource()==b7) {
			int a = Integer.parseInt(t1.getText());
			balance = balance + a;
			l2.setText("Deposited success");
		}
		if(e.getSource()==b3) {
			l1.setText("Your balnce is "+balance);
		}
		if(e.getSource()==b4) {
			new ShowAccount();
		}
		if(e.getSource()==b5) {
			new BankInterest();
		}
	}
	public static void main(String[] args) {
		new Bank1();
	}
}