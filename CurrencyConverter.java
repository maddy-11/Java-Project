import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
class CurrencyConverter implements ActionListener {
JFrame f;
Container c;
JLabel l1,l2,l3;
JTextField t1,t2;
JButton b1,b2;


CurrencyConverter() {
f=new JFrame("Currency Converter");
f.setBounds(200,200,350,260);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Font f1 = new Font("Arial",Font.BOLD,20);
//---------------------//
c=new Container();
c=f.getContentPane();
c.setBackground(new Color(192,192,192));
c.setLayout(null);
//-------------------------//
l1=new JLabel("Currency Converter");
l1.setForeground(new Color(200,10,10));
l1.setFont(f1);
l2=new JLabel("Rupees");
l3=new JLabel("US Dollar");
t1=new JTextField();
t2=new JTextField();
b1=new JButton("Rupees");
b1.setBackground(new Color(230,230,230));
b2=new JButton("Dollar");
b2.setBackground(new Color(230,230,230));
//--------------------------//
l1.setBounds(75,20,200,30);
l2.setBounds(70,60,100,30);
l3.setBounds(60,100,100,30);
t1.setBounds(150,60,130,25);
t2.setBounds(150,100,130,25);
b1.setBounds(70,150,100,40);
b2.setBounds(180,150,100,40);
//--------------------------//
f.setUndecorated(false);
b1.addActionListener(this);
b2.addActionListener(this);
c.add(l1);
c.add(l2);
c.add(l3);
c.add(t1);
c.add(t2);
c.add(b1);
c.add(b2);
f.setResizable(false);
f.setVisible(true);
//--------------------------//
}
    public static void main(String[] args) {
        new CurrencyConverter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //--------------//
        double a;
        DecimalFormat df = new DecimalFormat("0.00");

        if(e.getSource()==b1)
        {
            a=Double.parseDouble(t2.getText());
            t1.setText(String.valueOf(String.format("%.02f",a*160.550 )));
            
        }
        if(e.getSource()==b2)
        {
            a=Double.parseDouble(t1.getText());
            //t2.setText(""+a/160.50);
            t2.setText(String.valueOf(String.format("%.02f",a/160.550 )));
            
        }
        
        
        
      //--------------//
    }
}