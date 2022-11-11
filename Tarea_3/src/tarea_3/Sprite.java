package tarea_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Sprite extends Bebida {
    public Sprite(int num){
        super();
        super.setSerie("" + num);
        
        this.setBounds(0, 0, 60, 40);
        this.setOpaque(false);
    }
    
    public String Beber(){
        System.out.println("Gluglu");
        return "Sprite";
    }
    
    @Override
    public String getSabor(){
        return "Sprite";
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(this.getX()+155, this.getY()-10, this.getHeight(), this.getWidth());
        
        g.setColor(Color.black);
        g.setFont(new Font("SansSerif.", 1, 10));
        g.drawString("Sprite", this.getX()+170, this.getY()-15+(this.getHeight()/2)-10);
        g.drawString(super.getSerie(), this.getX()+175, this.getY()-5+(this.getHeight()/2)-10);
    }
}
