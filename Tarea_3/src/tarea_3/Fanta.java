package tarea_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Fanta extends Bebida {
    public Fanta(int num){
        super();
        super.setSerie(""+ num);
        
        this.setBounds(0, 0, 60, 40);
        this.setOpaque(false);
    }
    
    public String Beber(){
        System.out.println("Gluglu");
        return "Fanta";
    }
    
    @Override
    public String getSabor(){
        return "Fanta";
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillRect(this.getX()+275, this.getY()-10, this.getHeight(), this.getWidth());
        
        g.setColor(Color.black);
        g.setFont(new Font("Arial", 1, 10));
        g.drawString("Fanta", this.getX()+290, this.getY()-15+(this.getHeight()/2)-10);
        g.drawString(super.getSerie(), this.getX()+295, this.getY()-5+(this.getHeight()/2)-10);
    }
}
