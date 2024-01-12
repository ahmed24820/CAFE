/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SysteamFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI extends Cafe implements ItemListener {

/**
 *
 * @author elkhalil
 */

 

    JPanel p1,p2,p3;
    JButton b1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JTextField f1,f2,f3,f4,f5,f6,f7;
    vn v=new vn();
    public GUI(){
      super(); 
    JFrame j =new JFrame("Banda cafee"); 
    j.setSize(500,500);
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p1=new JPanel();  p2=new JPanel();p3=new JPanel();
  
    l1=new JLabel("Drinks");  l3=new JLabel("PRICE");l4=new JLabel("teaorder:");l5=new JLabel("cofeeorder :");
    l6=new JLabel("nescafee order :");l7=new JLabel("checolatee num"); l8=new JLabel("pepsi order :");
    l9=new JLabel("water number :");    l10=new JLabel("TOTAL :");
  
    b1=new JButton("SHOW");
    
    
    c1=new JCheckBox("tea");c2=new JCheckBox("coffe"); c3=new JCheckBox("nescafee"); c4=new JCheckBox("checolate");
    c5=new JCheckBox("pepsi");c6=new JCheckBox("water");
    
    f1=new JTextField(); f2=new JTextField();f3=new JTextField();f4=new JTextField();f5=new JTextField();f6=new JTextField();  f7=new JTextField();
    
    
  j.setLayout(new GridLayout(3,1));
  
    j.add(p1);j.add(p2);j.add(p3);
    p1.setBackground(Color.lightGray);p2.setBackground(Color.lightGray);p3.setBackground(Color.lightGray);p1.setLayout(null);
    
    p1.add(l1);p1.add(c1);p1.add(c2);p1.add(c3);p1.add(f1);p1.add(f2);p1.add(f3);p1.add(l4);p1.add(l5);p1.add(l6);
    c1.setBounds(10,40,100,20);c1.setBackground(Color.white);l4.setBounds(220,40,100,20);c2.setBounds(10,80,100,20);c2.setBackground(Color.white);
    l5.setBounds(220,80,90,10);c3.setBounds(10,120,100,20); c3.setBackground(Color.white);l6.setBounds(220,120,90,10);
    f1.setBounds(320,40,150,20);f2.setBounds(320,80,150,20);f3.setBounds(320,120,150,20);l1.setBounds(220,10,60,10); 
  
    
    l1.setForeground(Color.black);
    p2.setLayout(null);
    p2.add(c4);p2.add(c5);p2.add(c6);
    p2.add(f4);p2.add(f5);p2.add(f6);
    p2.add(l7);p2.add(l8);p2.add(l9);
    c4.setBounds(10,40,100,20);
    c4.setBackground(Color.white);
    l7.setBounds(220,40,100,20);
    c5.setBounds(10,80,100,20);
    c5.setBackground(Color.white);
    l8.setBounds(220,80,100,20);
    c6.setBounds(10,120,100,20);
    c6.setBackground(Color.white);
    l9.setBounds(220,120,100,20);
    f4.setBounds(320,40,150,20);
    f5.setBounds(320,80,150,20);
    f6.setBounds(320,120,150,20);
    //l2.setBounds(220,10,60,10);
    p3.setLayout(null);
    p3.add(l3);p3.add(b1);p3.add(l10);p3.add(f7);
    
    l3.setBounds(220,10,60,10);
    l3.setForeground(Color.WHITE);
    l10.setBounds(10,40,60,10);
    l10.setForeground(Color.WHITE);
    b1.setBounds(200,80,90,30);
    f7.setBounds(60,40,200,20);
    
    c1.addItemListener(this);c2.addItemListener(this);c3.addItemListener(this);c4.addItemListener(this);c5.addItemListener(this);c6.addItemListener(this);
    b1.addActionListener(v);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
            int x,y,z,r,f,w;
            
            if(c1.isSelected()){
            f1.getText();
            }
            else if(c2.isSelected()){
            f2.getText();
            }
            else if(c3.isSelected()){
            f3.getText();
            }
            else if(c4.isSelected()){
            f4.getText();
            }
            else if(c5.isSelected()){
            f5.getText();
            }
            else if(c6.isSelected()){
            f6.getText();
            }
            
//            if(c1.isSelected()&&c2.isSelected()&&c3.isSelected()&&c4.isSelected()&&c5.isSelected()&&c6.isSelected()){
//            x=Integer.parseInt(f1.getText());
//            y=Integer.parseInt(f2.getText());
//            z=Integer.parseInt(f3.getText());
//            r=Integer.parseInt(f4.getText());
//            f=Integer.parseInt(f5.getText());
////            w=Integer.parseInt(f6.getText());
    }
    
  
    
    private class vn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
     double t1,t2,t3,t4,t5,t6,total;
       if(e.getSource()==b1&&c1.isSelected()&&c2.isSelected()&&c3.isSelected()&&c4.isSelected()&&c5.isSelected()&&c6.isSelected()){
          total=(Integer.parseInt(f1.getText())*teaprice)+(Integer.parseInt(f2.getText())*coffeprice)+(Integer.parseInt(f3.getText())*nescafeeprice)+(Integer.parseInt(f4.getText())*chocleetprice)+
                  (Integer.parseInt(f5.getText())*pepsi)+(Integer.parseInt(f6.getText())*waterprice);
          f7.setText(""+total);
       }
       
               else if(e.getSource()==b1&&c1.isSelected()&&c2.isSelected()&&c3.isSelected()){
            t1=Integer.parseInt(f1.getText())*teaprice+Integer.parseInt(f2.getText())*coffeprice+Integer.parseInt(f3.getText())*nescafeeprice;
            f7.setText(""+t1);
            }
               
                    else if(e.getSource()==b1&&c1.isSelected()&&c2.isSelected()&&c4.isSelected()){
            t1=Integer.parseInt(f1.getText())*teaprice+Integer.parseInt(f2.getText())*coffeprice+Integer.parseInt(f4.getText())*chocleetprice;
            f7.setText(""+t1);
            }
                         else if(e.getSource()==b1&&c1.isSelected()&&c2.isSelected()&&c5.isSelected()){
            t1=Integer.parseInt(f1.getText())*teaprice+Integer.parseInt(f2.getText())*coffeprice+Integer.parseInt(f5.getText())*pepsi;
            f7.setText(""+t1);
            }
                    else if(e.getSource()==b1&&c1.isSelected()&&c2.isSelected()&&c6.isSelected()){
            t1=Integer.parseInt(f1.getText())*teaprice+Integer.parseInt(f2.getText())*coffeprice+Integer.parseInt(f3.getText())*waterprice;
            f7.setText(""+t1);
            }
               
               
        
           else if(e.getSource()==b1&&c1.isSelected()&&c2.isSelected()){
            t1=Integer.parseInt(f1.getText())*teaprice+Integer.parseInt(f2.getText())*coffeprice;
            f7.setText(""+t1);
            }
            else if(e.getSource()==b1&&c1.isSelected()&&c3.isSelected()){
            t1=Integer.parseInt(f1.getText())*teaprice+Integer.parseInt(f3.getText())*nescafeeprice;
            f7.setText(""+t1);
            }
             else if(e.getSource()==b1&&c1.isSelected()&&c4.isSelected()){
            t1=Integer.parseInt(f1.getText())*teaprice+Integer.parseInt(f4.getText())*chocleetprice;
            f7.setText(""+t1);
            }
              else if(e.getSource()==b1&&c1.isSelected()&&c5.isSelected()){
            t1=Integer.parseInt(f1.getText())*teaprice+Integer.parseInt(f5.getText())*pepsi;
            f7.setText(""+t1);
            }
               else if(e.getSource()==b1&&c1.isSelected()&&c6.isSelected()){
            t1=Integer.parseInt(f1.getText())*teaprice+Integer.parseInt(f6.getText())*waterprice;
            f7.setText(""+t1);
            }
                 else if(e.getSource()==b1&&c1.isSelected()){
            t1=Integer.parseInt(f1.getText())*teaprice;
            f7.setText(""+t1);
            }
        
          
else if(e.getSource()==b1&&c2.isSelected()&&c3.isSelected()){
 t2=Integer.parseInt(f2.getText())*coffeprice+Integer.parseInt(f3.getText())*nescafeeprice;
 f7.setText(""+t2);}

  else if(e.getSource()==b1&&c2.isSelected()&&c4.isSelected()){
 t2=Integer.parseInt(f2.getText())*coffeprice+Integer.parseInt(f4.getText())*chocleetprice;
 f7.setText(""+t2);}

  else if(e.getSource()==b1&&c2.isSelected()&&c5.isSelected()){
 t2=Integer.parseInt(f2.getText())*coffeprice+Integer.parseInt(f5.getText())*pepsi;
 f7.setText(""+t2);}

   else if(e.getSource()==b1&&c2.isSelected()&&c6.isSelected()){
 t2=Integer.parseInt(f2.getText())*coffeprice+Integer.parseInt(f6.getText())*waterprice;
 f7.setText(""+t2);}

     else if(e.getSource()==b1&&c2.isSelected()){
 t2=Integer.parseInt(f2.getText())*coffeprice;
 f7.setText(""+t2);}

 else if(e.getSource()==b1&&c3.isSelected()&&c4.isSelected()){
    t3=Integer.parseInt(f3.getText())*nescafeeprice+Integer.parseInt(f4.getText())*chocleetprice;
    f7.setText(""+t3);
    }

   else if(e.getSource()==b1&&c3.isSelected()&&c5.isSelected()){
            t3=Integer.parseInt(f3.getText())*coffeprice+Integer.parseInt(f5.getText())*pepsi;
            f7.setText(""+t3);}
              
                  else if(e.getSource()==b1&&c3.isSelected()&&c6.isSelected()){
               t3=Integer.parseInt(f3.getText())*nescafeeprice+Integer.parseInt(f6.getText())*waterprice;
               f7.setText(""+t3);
               }
                      else if(e.getSource()==b1&&c3.isSelected()){
               t3=Integer.parseInt(f3.getText())*nescafeeprice;
               f7.setText(""+t3);
               }
            
            else if(e.getSource()==b1&&c4.isSelected()&&c5.isSelected()){
            t4=Integer.parseInt(f4.getText())*chocleetprice+Integer.parseInt(f5.getText())*pepsi;
            f7.setText(""+t4);
            } 
              else if(e.getSource()==b1&&c4.isSelected()&&c6.isSelected()){
            t4=Integer.parseInt(f4.getText())*chocleetprice+Integer.parseInt(f6.getText())*waterprice;
            f7.setText(""+t4);
            } 
                      
                else if(e.getSource()==b1&&c4.isSelected()){
            t4=Integer.parseInt(f4.getText())*chocleetprice;
            f7.setText(""+t4);
            } 
                    else if(e.getSource()==b1&&c5.isSelected()&&c6.isSelected()){
            t5=Integer.parseInt(f5.getText())*pepsi+Integer.parseInt(f6.getText())*waterprice;
            f7.setText(""+t5 );
       }
            else if(e.getSource()==b1&&c5.isSelected()){
            t5=Integer.parseInt(f5.getText())*pepsi;
            f7.setText(""+t5 );
       }
          else if(e.getSource()==b1&&c6.isSelected()){
            t6=Integer.parseInt(f6.getText())*waterprice;
            f7.setText(""+t6);
           }
         
          }
    
    }
    
}

    

 




//    @Override
//    public void actionPerformed(ActionEvent e) {
//        int x,y;
//        
//          if(e.getSource()==b1){
//      
//         x=Integer.parseInt(f1.getText());
//          f7.setText(""+ x*chickenprice);
//          
//          
//          
//          }
//    }  

//    @Override
//    public void itemStateChanged(ItemEvent ie) {
//        if(){
//        
//         int x,y;
//        
//          if(ie.getSource()==b1){
//      
//         x=Integer.parseInt(f1.getText());
//          f7.setText(""+ x*chickenprice);
//          
//}
