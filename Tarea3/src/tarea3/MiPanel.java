
package tarea3;

import java.awt.*;
import javax.swing.JPanel;

public class MiPanel extends JPanel {
    JPanel P1;
    
    public MiPanel(){
       this.setBackground(Color.darkGray);
       P1=new JPanel();
       P1.setBackground(Color.lightGray);
       this.setPreferredSize(new Dimension(400,500));
       P1.setPreferredSize(new Dimension(350,450));
       P1.setLocation(0, 100);
       this.add(P1);
    } 

    /*public void paint(Graphics g){   
       super.paint(g);   // se llama al paint de la super clase 
       g.setColor(Color.red);
       g.fillRect(40,40,50,30);
    }*/
    
    
    
}