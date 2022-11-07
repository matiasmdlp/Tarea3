
package tarea3;

import java.awt.*;
import javax.swing.JPanel;

public class MiPanel3 extends JPanel {
    JPanel P1;
    
    public MiPanel3(){
       this.setBackground(Color.darkGray);
       P1=new JPanel();
       P1.setBackground(Color.lightGray);
       this.setPreferredSize(new Dimension(575,150));
       P1.setPreferredSize(new Dimension(475,100));
       this.add(P1);
    } 

    /*public void paint(Graphics g){   
       super.paint(g);   // se llama al paint de la super clase 
       g.setColor(Color.red);
       g.fillRect(40,40,50,30);
    }*/    
}