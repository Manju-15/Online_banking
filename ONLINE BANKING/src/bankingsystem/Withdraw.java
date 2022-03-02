package bankingsystem;
import java.awt.*;
import java.awt.event.*;
public class Withdraw extends Bank1 implements ActionListener{
	Frame f4 = new Frame("Bank Withdraw");
	Label l1,l2,l3;
	TextField t;
	Button b1,b2;
    Withdraw() {
    	f4.setBackground(Color.LIGHT_GRAY);
    	l1 = new Label("Withdraw");
    	l1.setForeground(Color.RED);
        l2 = new Label("Enter amount to Withdraw");
        l3 = new Label("!");
        t = new TextField();
        b1 = new Button("Ok");
        b2 = new Button("Cancel");
        l1.setBounds(100,50,200,20);
        l2.setBounds(25,80,200,20);
        t.setBounds(35,120,100,20);
        l3.setBounds(50,160,200,20);
        b1.setBounds(50,200,100,20);
        b2.setBounds(170,200,100,20);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f4.add(l1);
        f4.add(l2);
        f4.add(l3);
        f4.add(t);
        f4.add(b1);
        f4.add(b2);
        f4.setSize(300,300);
        f4.setLayout(null);
        f4.setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			f1.setVisible(false);
			f4.setVisible(false);
			new Bank1();
		}
		int amt = Integer.parseInt(t.getText());
		if(e.getSource()==b1) {
			if(amt > balance) {
				l3.setText("Insufficient balance");
			}
			if(amt > 20000) {
				l3.setText("withdraw lessthan 20000 at once");
			}
			if(amt < balance) {
				if(amt <= 0) {
					l3.setText("Invalid amount");
				}
				else {
				    l3.setText("Amount withdraw successfully");
			        balance = balance - amt;
				}
			}
		}
	}
    public static void main(String[] args) {
    	new Withdraw();
    }
}
