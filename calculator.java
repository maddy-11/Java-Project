import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class calculator implements ActionListener
{
    JFrame f;
    JTextField jtext;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bclr,bdel,beq,bdec;
    static double a=0,b=0,result=0;
    static int op=0;
    
    //--------------------------------//
    calculator(){
    f= new JFrame("Calculator");
    
    f.setLayout(null);
    //f.setForeground(Color.BLACK);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setBounds(250,200,350,510);
    f.setResizable(true);
    Container c = f.getContentPane();
    c.setLayout(null);
    Font font = new Font("Georgia",Font.BOLD,20);
    
    
    b1=new JButton("1");
    b2=new JButton("2");
    b3=new JButton("3");
    b4=new JButton("4");
    b5=new JButton("5");
    b6=new JButton("6");
    b7=new JButton("7");
    b8=new JButton("8");
    b9=new JButton("9");
    b0=new JButton("0");
    beq=new JButton("=");
    bdel=new JButton("Delete");
    badd=new JButton("+");
    bsub=new JButton("-");
    bdec=new JButton(".");
    bmul=new JButton("x");
    bclr=new JButton("Clear");
    bdiv=new JButton("/");
    //-------------------------//
    b7.setBounds(45, 100, 50, 40);
    b8.setBounds(110, 100, 50, 40);
    b9.setBounds(175, 100, 50, 40);
    bdiv.setBounds(240, 100, 50, 40);
    b4.setBounds(45, 175, 50, 40);
    b5.setBounds(110, 175, 50, 40);
    b6.setBounds(175, 175, 50, 40);
    bmul.setBounds(240, 175, 50, 40);
    b1.setBounds(45, 250, 50, 40);
    b2.setBounds(110, 250, 50, 40);
    b3.setBounds(175, 250, 50, 40); 
    bsub.setBounds(240, 250, 50, 40);
    bdec.setBounds(45, 325, 50, 40);
    b0.setBounds(110, 325, 50, 40);
    beq.setBounds(175, 325, 50, 40);
    badd.setBounds(240, 325, 50, 40);
    bclr.setBounds(175, 400, 100, 40);    
    bdel.setBounds(60, 400, 100, 40);
   
    //-------------------------//
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(b0);
    f.add(badd);
    f.add(bsub);
    f.add(bmul);
    f.add(bdiv);
    f.add(bdel);
    f.add(bclr);
    f.add(beq);
    f.add(bdec);
    //------------------------//
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    badd.addActionListener(this);
    bsub.addActionListener(this);
    bmul.addActionListener(this);
    bdiv.addActionListener(this);
    beq.addActionListener(this);
    bdel.addActionListener(this);
    bclr.addActionListener(this);
    bdec.addActionListener(this);
    jtext =new JTextField();
    jtext.setFont(font);
    jtext.setVisible(true);
    jtext.setBackground(Color.WHITE);
    jtext.setForeground(Color.BLACK);
    jtext.setBounds(45,50,245,30);
    f.add(jtext);
    f.setVisible(true);
    
    }
public static void main(String []args){

new calculator();
}

    @Override
    public void actionPerformed(ActionEvent e) {
       
       if(e.getSource()==b1)
       {
      jtext.setText(jtext.getText().concat("1"));
        }
       if(e.getSource()==b2)
       {
      jtext.setText(jtext.getText().concat("2"));
        }
       if(e.getSource()==b3)
       {
      jtext.setText(jtext.getText().concat("3"));
        }
       if(e.getSource()==b4)
       {
      jtext.setText(jtext.getText().concat("4"));
        }
       if(e.getSource()==b5)
       {
      jtext.setText(jtext.getText().concat("5"));
        }
       if(e.getSource()==b6)
       {
      jtext.setText(jtext.getText().concat("6"));
        }
       if(e.getSource()==b7)
       {
      jtext.setText(jtext.getText().concat("7"));
        }
       if(e.getSource()==b8)
       {
      jtext.setText(jtext.getText().concat("8"));
        }
       if(e.getSource()==b9)
       {
      jtext.setText(jtext.getText().concat("9"));
        }
       if(e.getSource()==b0)
       {
      jtext.setText(jtext.getText().concat("0"));
        }       
       if(e.getSource()==bdec)
       {
      jtext.setText(jtext.getText().concat("."));
        }if(e.getSource()==badd)
       {
      a=Double.parseDouble(jtext.getText());
      op=1;
      jtext.setText("");
        }
        if(e.getSource()==bsub)
       {
       a=Double.parseDouble(jtext.getText());
      op=2;
      jtext.setText("");
        }
    if(e.getSource()==bmul)
       {
      a=Double.parseDouble(jtext.getText());
      op=3;
      jtext.setText("");
        }
       if(e.getSource()==bdiv)
       {
      a=Double.parseDouble(jtext.getText());
      op=4;
      jtext.setText("");
        }
       //-----------------------------------------//
        if(e.getSource()==bclr)
       {
      jtext.setText("");
        }
        //-----------------------------------------//
        if(e.getSource()==bdel)
       {
      String s;
      s=jtext.getText();
      jtext.setText("");
      for(int i=0;i<s.length()-1;i++)
      {
          
          jtext.setText(jtext.getText()+s.charAt(i));
      }
        }
        //-----------------------------------------//
        if(e.getSource()==beq)
       {
     b=Double.parseDouble(jtext.getText());
     switch(op)
     {
         case 1:
            result=a+b;
             break;
         case 2:
             result = a-b;
             break;
         case 3:
             result = a*b;
             break;
         case 4:
             result = a/b;    
             break;
             
     }
     jtext.setText(""+result);
        }
        

    }
}