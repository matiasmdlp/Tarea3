package tarea_3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DepositoExp extends JPanel{
    private ArrayList<Bebida> ar;
    private Bebida bebida ;
        
    public DepositoExp(){
        ar = new ArrayList<>();
    }
    
    public void addBebida(Bebida b){
        ar.add(b);
        bebida = ar.get(0);
    }
    
    public Bebida getBebida(){
        return ar.remove(0);
    }
    
    public Boolean isEmpty(){
        return ar == null;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
                
        this.setBounds(200, 560, 160, 80);
        this.setOpaque(false);   
        g.setColor(Color.black);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        if(bebida != null){
            bebida.setBounds(260, 580, 80, 40);
            bebida.paintComponent(g);
        }
    }
}
