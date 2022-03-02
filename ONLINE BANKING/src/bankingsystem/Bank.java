package bankingsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPasswordField;
public class Bank implements ActionListener{
	static int balance;
	static String name;
	Frame f = new Frame("LogIn page");
	static String q;
	Button b1,b2;
	Label l1, l2, l3;
	TextField t1;
	JPasswordField t2;
	Bank() {
		f.setBackground(Color.LIGHT_GRAY);
		l1 = new Label("Username");
		l2 = new Label("Password");
		t1 = new TextField();
		t2 = new JPasswordField();
		b1 = new Button("LogIn");
		l3 = new Label("please login");
		b2 = new Button("Cancel");
		l1.setBounds(25,50,100,20);
		l2.setBounds(25,100,100,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(150,100,100,20);
		b1.setBounds(100,150,50,20);
		l3.setBounds(150,150,100,20);
		b2.setBounds(200,250,50,20);
		b1.addActionListener(this);
	    b2.addActionListener(this);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		q = t1.getText();
		if(q.equals("student1")) {
			balance = balance + 5000;
			String s1 = "student1";
			name = s1;
		}
		else if(q.equals("student2")) {
			balance = balance +1000;
			String s2 = "student2";
			name = s2;
		}
		if(e.getSource()== b1) {
			if(t1.getText().equals("student1") && t2.getText().equals("123")) {
				l3.setText("login success");
				new Bank1();
				f.setVisible(false);
			}
			else if(t1.getText().equals("student2") && t2.getText().equals("1234")){
				l3.setText("login success");
				new Bank1();
				f.setVisible(false);
			}
			else {
				l3.setText("Invalid login");
		    }
		}
		if(e.getSource()==b2) {
			f.setVisible(false);
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Bank();
	}
	
}
