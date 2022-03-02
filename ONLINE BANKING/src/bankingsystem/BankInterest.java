package bankingsystem;
import java.awt.*;
import java.awt.event.*;
public class BankInterest extends Bank1 implements ActionListener{
	Frame f2 = new Frame("Bank Interest");
	Label l1 = new Label("Investment");
	Label l2 = new Label("Tenture/year");
	Label l3 = new Label("Interest Amount");
    Label l4 = new Label("Total Amount");
	TextField t1 = new TextField();
	TextField t4 = new TextField();
	TextField t3 = new TextField();
	Choice c=new Choice();                  
    Button b1 = new Button("Axis");
    Button b2 = new Button("Canara");
    Button b3 = new Button("ICICI");
    Button b4 = new Button("HDFC");
    Button b6 = new Button("Cancel");
    Button b7 = new Button(".");
    BankInterest(){
    	l1.setBounds(25, 75, 80, 20);
    	l2.setBounds(25, 120, 80, 20);
    	l3.setBounds(25, 170, 80, 20);
    	l4.setBounds(25, 215, 80, 20);
    	t1.setBounds(150, 75, 200, 20);
    	c.setBounds(150, 120, 200, 20);
    	t3.setBounds(150, 170, 200, 20);
    	t4.setBounds(150, 215, 200, 20);
    	b1.setBounds(25, 250, 70, 20);
    	b2.setBounds(100, 250, 70, 20);
    	b3.setBounds(175, 250, 70, 20);
    	b4.setBounds(250, 250, 70, 20);
    	b6.setBounds(200,350,50,20);
    	b7.setBounds(300, 250, 70, 20);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	b4.addActionListener(this);
    	b6.addActionListener(this);
    	b7.addActionListener(this);
    	c.add("1");c.add("2");c.add("3");c.add("4");c.add("5");
    	c.add("6");c.add("7");c.add("8");c.add("9");c.add("10");
    	f2.add(l1);
    	f2.add(l2);
    	f2.add(l3);
    	f2.add(l4);
    	f2.add(t1);
    	f2.add(c);
    	f2.add(t3);
    	f2.add(t4);
    	f2.add(b1);
    	f2.add(b2);
    	f2.add(b3);
    	f2.add(b4);
    	f2.add(b6);
    	f2.add(b7);
    	f2.setBackground(Color.LIGHT_GRAY);
        f2.setSize(400, 400);
    	f2.setVisible(true);
    	f2.setLayout(null);
    }
 	public void actionPerformed(ActionEvent e) {
 		if(e.getSource()==b6) {
		    new Bank1();
		    f2.setVisible(false);
		    f1.setVisible(false);
		}
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(c.getSelectedItem());
		if(e.getSource()==b1) {
			double i = (float)(a*b*(4.40/100));
		    double c = (float)a+(a*b*(4.40/100));
		    t3.setText(i+"");
		    t4.setText(c+"");
		}
		if(e.getSource()==b2) {
			double i = (float)(a*b*(6.75/100));
		    double c = (float)a+(a*b*(6.75/100));
		    t3.setText(i+"");
		    t4.setText(c+"");
		}
		if(e.getSource()==b3) {
			if(b==1) {
			    double i = (float)(a*b*(4.991/100));
			    double c = (float)a+(a*b*(4.991/100));
			    t3.setText(i+"");
			    t4.setText(c+"");
			}
			if(b==2) {
			    double i = (float)(a*b*(5.224/100));
			    double c = (float)a+(a*b*(5.224/100));
			    t3.setText(i+"");
			    t4.setText(c+"");
			}
			if(b==3) {
			    double i = (float)(a*b*(5.526/100));
			    double c = (float)a+(a*b*(5.526/100));
			    t3.setText(i+"");
			    t4.setText(c+"");
			}
			if(b==4) {
			    double i = (float)(a*b*(5.919/100));
			    double c = (float)a+(a*b*(5.919/100));
			    t3.setText(i+"");
			    t4.setText(c+"");
			}
			if(b==5) {
			    double i = (float)(a*b*(5.35/100));
			    double c = (float)a+(a*b*(5.35/100));
			    t3.setText(i+"");
			    t4.setText(c+"");
			}
			if(b==6) {
			    double i = (float)(a*b*(5.50/100));
			    double c = (float)a+(a*b*(5.50/100));
			    t3.setText(i+"");
			    t4.setText(c+"");
			}
			if(b>=7 && b<=10) {
			    double i = (float)(a*b*(5.70/100));
			    double c = (float)a+(a*b*(5.70/100));
			    t3.setText(i+"");
			    t4.setText(c+"");
			}
		}
		if(e.getSource()==b4) {
		    double i = (float)(a*b*(6.5/100));
		    double c = (float)a+(a*b*(6.5/100));
		    t3.setText(i+"");
		    t4.setText(c+"");
		}
	}
	public static void main(String[] args) {
		new BankInterest();
	}

}
