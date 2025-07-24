package  com.example.lockguard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener
{
   JLabel text;
   JButton continuebtn;
   Container c;
   Main()
   {
     c = this.getContentPane();
     setBounds(500,250,500,500);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setLayout(null);
     
     text=new JLabel("LOCKERGUARD");
     text.setBounds(150,200,490,100);
     
     text.setForeground(Color.RED);
     text.setFont(new Font("Arial",Font.BOLD,30));
     
     continuebtn=new JButton("Continue");
     continuebtn.setBounds(320,400,150,30);
     continuebtn.setBackground(Color.RED);
     continuebtn.setForeground(Color.WHITE);
     continuebtn.setFocusable(false);
     continuebtn.setFont(new Font("Arial",Font.BOLD,20));
     continuebtn.addActionListener(this);
     add(text);
     add(continuebtn);
      
      c.setBackground(Color.BLACK);
     setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
       setVisible(false);
      new Operation();
    
   }
  public static void main(String[] args) {
        new Main();
    }
}
