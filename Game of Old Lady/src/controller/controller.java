/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author gusta
 */

public class controller {
    public class MyFrame extends JFrame implements MouseListener{

   /** Number of times the mouse was clicked */
   private  int clicks = 0;
   private int jogador;
   private int par;
   private int impar;
   
   public MyFrame () 
   {
      this.addMouseListener(this);
   }

   public void mouseClicked(MouseEvent e) 
   { 
       //Increment click count
       clicks++;
       if( clicks%2 == 0){
           jogador = par;
       }
       else {
           jogador = impar;
       }
   }

   public void mouseEntered(MouseEvent e) {}
   public void mouseExited(MouseEvent e) {}
   public void mousePressed(MouseEvent e){}    
   public void mouseReleased(MouseEvent e)  { }

}
}
    