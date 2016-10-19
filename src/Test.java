/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 桃之夭夭
 */
import java.awt.*; 
      import java.awt.event.ActionEvent; 
      import java.awt.event.ActionListener; 
       
      import javax.swing.*; 
      public class Test extends JFrame{ 
      double shu1=0,shu2=0; 
      JLabel label=new JLabel(); 
      int n=0; 
      public Test() 
      { 
      JPanel p1=new JPanel(); 
      p1.setLayout(new GridLayout(5,3)); 
      JButton a1=new JButton("1"); 
      JButton a2=new JButton("2"); 
      JButton a3=new JButton("3"); 
      JButton a4=new JButton("4"); 
      JButton a5=new JButton("5"); 
      JButton a6=new JButton("6"); 
      JButton a7=new JButton("7"); 
      JButton a8=new JButton("8"); 
      JButton a9=new JButton("9"); 
      JButton a0=new JButton("0"); 
      JButton aequal=new JButton("="); 
      JButton aadd=new JButton("+"); 
      JButton asub=new JButton("-"); 
      JButton amul=new JButton("*"); 
      JButton adiv=new JButton("/"); 
      p1.add(a1); 
      p1.add(a2); 
      p1.add(a3); 
      p1.add(a4); 
      p1.add(a5); 
      p1.add(a6); 
      p1.add(a7); 
      p1.add(a8); 
      p1.add(a9); 
      p1.add(a0); 
      p1.add(aadd); 
      p1.add(asub); 
      p1.add(amul); 
      p1.add(adiv); 
      p1.add(aequal); 
      add(label,BorderLayout.NORTH); 
      add(p1,BorderLayout.SOUTH); 
      ActionListener listener0=new A0(); 
      ActionListener listener1=new A1(); 
      ActionListener listener2=new A2(); 
      ActionListener listener3=new A3(); 
      ActionListener listener4=new A4(); 
      ActionListener listener5=new A5(); 
      ActionListener listener6=new A6(); 
      ActionListener listener7=new A7(); 
      ActionListener listener8=new A8(); 
      ActionListener listener9=new A9(); 
      ActionListener listenerequal=new Aequal(); 
      ActionListener listeneradd=new Aadd(); 
      ActionListener listenersub=new Asub(); 
      ActionListener listenermul=new Amul(); 
      ActionListener listenerdiv=new Adiv(); 
      a0.addActionListener(listener0); 
      a1.addActionListener(listener1); 
      a2.addActionListener(listener2); 
      a3.addActionListener(listener3); 
      a4.addActionListener(listener4); 
      a5.addActionListener(listener5); 
      a6.addActionListener(listener6); 
      a7.addActionListener(listener7); 
      a8.addActionListener(listener8); 
      a9.addActionListener(listener9); 
      aequal.addActionListener(listenerequal); 
      aadd.addActionListener(listeneradd); 
      asub.addActionListener(listenersub); 
      amul.addActionListener(listenermul); 
      adiv.addActionListener(listenerdiv); 
      } 
      public static void main(String[] args) { 
      Test test=new Test(); 
      test.setTitle("简单计算器"); 
      test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      test.setResizable(false); 
      test.setSize(300, 300); 
      test.setLocation(300, 300); 
      test.setVisible(true); 
      } 
      public class A0 implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      shu1=shu1*10+0; 
      label.setText(Double.toString(shu1)); 
      } 
      } 
public class A1 implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      shu1=shu1*10+1; 
      label.setText(Double.toString(shu1)); 
      } 
      } 
      public class A2 implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      
      shu1=shu1*10+2; 
      label.setText(Double.toString(shu1)); 
      } 
      } 
      public class A3 implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      shu1=shu1*10+3; 
      label.setText(Double.toString(shu1)); 
      } 
      } 
      
      public class A4 implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      shu1=shu1*10+4; 
      label.setText(Double.toString(shu1)); 
      } 
      } 
      
      public class A5 implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      shu1=shu1*10+5; 
      label.setText(Double.toString(shu1)); 
      } 
      } 
      
      public class A6 implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      shu1=shu1*10+6; 
      label.setText(Double.toString(shu1)); 
      } 
      } 
      
      public class A7 implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      shu1=shu1*10+7; 
      label.setText(Double.toString(shu1)); 
      } 
      } 
      
      public class A8 implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      shu1=shu1*10+8; 
      label.setText(Double.toString(shu1)); 
      } 
      } 
      
      public class A9 implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      shu1=shu1*10+9; 
      label.setText(Double.toString(shu1)); 
      } 
      } 
      public class Aequal implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      switch(n) 
      { 
      case 1: 
      label.setText(Double.toString(shu2+shu1)); 
      n=0; 
      break; 
      case 2: 
      label.setText(Double.toString(shu2-shu1)); 
      n=0; 
      break; 
      case 3: 
      label.setText(Double.toString(shu2*shu1)); 
      n=0; 
      break; 
      case 4: 
      label.setText(Double.toString(shu2/shu1)); 
      n=0; 
      break; 
      } 
      shu1=0; 
      shu2=0; 
      } 
      } 
      public class Aadd implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      if(n!=0) 
      return; 
      shu2=shu1; 
      shu1=0; 
      label.setText(Double.toString(shu1)); 
      n=1; 
      } 
      } 
      public class Asub implements ActionListener
      { 
      public void actionPerformed(ActionEvent e)
      { 
      if(n!=0) 
      return; 
      shu2=shu1; 
      shu1=0; 
      label.setText(Double.toString(shu1)); 
      n=2; 
      } 
      } 
      public class Amul implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      if(n!=0) 
      return; 
      shu2=shu1; 
      shu1=0; 
      label.setText(Double.toString(shu1)); 
      n=3; 
      } 
      } 
      public class Adiv implements ActionListener 
      { 
      public void actionPerformed(ActionEvent e)
      { 
      if(n!=0) 
      return; 
      shu2=shu1; 
      shu1=0; 
      label.setText(Double.toString(shu1)); 
      n=4; 
      } 
      } 
      } 



