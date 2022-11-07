package tarea3;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MiPanel2 extends JPanel {
    JPanel P1, P2;
    JButton C,F,S, Pago;
    
    private EscuchaRaton1 er1;
    private EscuchaRaton2 er2;
    private EscuchaRaton3 er3;
    private EscuchaRaton4 er4;
    
    public MiPanel2(){
       er1=new EscuchaRaton1();
       er2=new EscuchaRaton2();
       er3=new EscuchaRaton3();
       er4=new EscuchaRaton4();
       this.setBackground(Color.darkGray);
       P1=new JPanel();
       P1.setBackground(Color.lightGray);
       this.setPreferredSize(new Dimension(200,500));
       P1.setPreferredSize(new Dimension(150,400));
       this.add(P1);
       
       C =new JButton("CocaCola");
       C.setPreferredSize(new Dimension(130,75));
       C.addMouseListener(er1);
       P1.add(C);
       
       F =new JButton("Fanta");
       F.setPreferredSize(new Dimension(130,75));
       F.addMouseListener(er2);
       P1.add(F);
       
       S =new JButton("Sprite");
       S.setPreferredSize(new Dimension(130,75));
       S.addMouseListener(er3);
       P1.add(S);
              
       P2=new JPanel();
       P2.setBackground(Color.lightGray);
       P2.setPreferredSize(new Dimension(130,60));
       P1.add(P2);      
       
       Pago =new JButton("Pago");
       Pago.setPreferredSize(new Dimension(130,75));
       Pago.addMouseListener(er4);
       P1.add(Pago);
       
    } 
    
       
    private class EscuchaRaton1  implements MouseListener {
         public void mouseClicked(MouseEvent me ) {;}
         public void mousePressed(MouseEvent me) {
              System.out.println("ER1: CocaCola");  
         }
         public void mouseReleased(MouseEvent me) {;}
         public void mouseEntered(MouseEvent me) {;}
         public void mouseExited(MouseEvent me) {;}
    }
    
    private class EscuchaRaton2  implements MouseListener {
         public void mouseClicked(MouseEvent me ) {;}
         public void mousePressed(MouseEvent me) {
              System.out.println("ER1: Fanta");  
         }
         public void mouseReleased(MouseEvent me) {;}
         public void mouseEntered(MouseEvent me) {;}
         public void mouseExited(MouseEvent me) {;}
    }
    
    private class EscuchaRaton3  implements MouseListener {
         public void mouseClicked(MouseEvent me ) {;}
         public void mousePressed(MouseEvent me) {
              System.out.println("ER1: Sprite");  
         }
         public void mouseReleased(MouseEvent me) {;}
         public void mouseEntered(MouseEvent me) {;}
         public void mouseExited(MouseEvent me) {;}
    }
    
    private class EscuchaRaton4  implements MouseListener {
         public void mouseClicked(MouseEvent me ) {;}
         public void mousePressed(MouseEvent me) {
              System.out.println("ER1: Pago");  
         }
         public void mouseReleased(MouseEvent me) {;}
         public void mouseEntered(MouseEvent me) {;}
         public void mouseExited(MouseEvent me) {;}
    }
    
    /*public void paint(Graphics g){   
       super.paint(g);   // se llama al paint de la super clase 
       g.setColor(Color.red);
       g.fillRect(40,40,50,30);
    }*/    
}
