package tarea_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Coca extends Bebida {
    public Coca(int num){
        super();
        super.setSerie(""+num);
        
        this.setBounds(0, 0, 60, 40);
        this.setOpaque(false);
    }
    
    public String Beber(){
        System.out.println("Gluglu");
        return "CocaCola";
    }
    
    public String getSabor(){
        return "CocaCola";
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(this.getX()+35, this.getY()-10, this.getHeight(), this.getWidth());
        
        g.setColor(Color.black);
        g.setFont(new Font("SansSerif.", 1, 10));
        g.drawString("CocaCola", this.getX()+40, this.getY()-15+(this.getHeight()/2)-10);
        g.drawString(super.getSerie(), this.getX()+55, this.getY()-5+(this.getHeight()/2)-10);
    }
}
