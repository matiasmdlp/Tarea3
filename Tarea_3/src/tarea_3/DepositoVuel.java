package tarea_3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DepositoVuel extends JPanel{
    
    private ArrayList<Moneda100> ar;
    
    public DepositoVuel(){
        ar = new ArrayList<Moneda100>();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        this.setBounds(480, 560, 160, 80);
        this.setOpaque(false);
        g.setColor(Color.black);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        if(!ar.isEmpty()){
            for(int i=0; i<ar.size() && i < 15; i++){
                ar.get(i).setBounds(this.getX()+(20*(i/5)), 
                        this.getY()+(100*((i/5)+1))-(20*(i+1)), 20, 20);
                ar.get(i).paintComponent(g);
            }
        }
    }
}
